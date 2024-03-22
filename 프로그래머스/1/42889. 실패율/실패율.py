def solution(N, stages):
    answer = []
    dict = {}
    playernum = len(stages)
    for i in range(1,N+1):
        if playernum == 0:
            dict[i] = 0
        else:
            dict[i] = stages.count(i) / playernum
            playernum -= stages.count(i) 
    sorted_dict = sorted(dict.items(), key= lambda item:item[1], reverse=True)
    for i in range(len(sorted_dict)):
        answer.append(sorted_dict[i][0])
    return answer