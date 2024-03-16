n = int(input())

arrB = list(map(int,input().split()))

arrA = []

sum = 0
for i in range(0,len(arrB)):
    
    if(i == 0):
        arrA.append(arrB[i])
    else:
        arrA.append(((i+1) * arrB[i]) - sum)
    sum += arrA[i]
print(*arrA)