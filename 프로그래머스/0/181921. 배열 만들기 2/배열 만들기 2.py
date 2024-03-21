def solution(l, r):
    answer = []
    for i in range(l,r+1):
        state = 0
        for x in str(i):
            if x != "0" and x != "5":
                state = 1
        if(state == 0):
            answer.append(i);
    if(len(answer)==0):  
        answer.append(-1)
            
    
    return answer