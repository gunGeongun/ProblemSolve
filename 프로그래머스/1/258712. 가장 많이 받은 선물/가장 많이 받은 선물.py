from collections import defaultdict
        
def solution(friends, gifts):
    
    idxTable = defaultdict()
    for i,friend in enumerate(friends):
        idxTable[friend]= i
    #준 사람 받은사람 테이블 생성
    recordTable = [[0 for _ in range(len(friends))]for _ in range(len(friends))]
    for gift in gifts:
        giver,reciever = gift.split(" ")
        recordTable[idxTable[giver]][idxTable[reciever]] += 1
    #준 선물 받은 선물 테이블 생성
    giftRecord = [[0 for _ in range(len(friends))] for _ in range(len(friends))]
    for i in range(len(recordTable)):
        givenum = 0
        receivenum = 0
        for j in range(len(recordTable)):
            givenum += recordTable[i][j]  #준 선물 수 
            receivenum += recordTable[j][i] # 받은 선물 수
        giftRecord[i][0] = givenum
        giftRecord[i][1] = receivenum
    
    giftIndex = []
    for x in giftRecord:
        x[2] = x[0] - x[1]
        giftIndex.append(x[2])
        
    maxrecv = 0
    for i, recevier in enumerate(friends):
        recv = 0
        for j, giver in enumerate(friends):
            if i == j:
                continue
            if recordTable[i][j] > recordTable[j][i]:
                recv += 1
            elif recordTable[i][j] == recordTable[j][i]:
                if giftIndex[i] > giftIndex[j]:
                    recv += 1
        maxrecv = max(maxrecv, recv)
            
    

    return maxrecv
    
    