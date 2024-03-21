def solution(array, commands):
    answer = []
    for i in range(len(commands)):
        x = commands[i][0]
        y = commands[i][1]
        z = commands[i][2]   
        result = (sorted(array[x-1:y]))[z-1]
        answer.append(result)
    print(result)
    print(answer)
    return answer