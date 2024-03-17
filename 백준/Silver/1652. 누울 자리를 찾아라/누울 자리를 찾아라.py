arr = []
for _ in range(int(input())):
    a = list(input())
    arr.append(a)

garoresult = 0
seroresult = 0
dot = '.'
for i in range(len(arr)):
    garoN = 0
    seroN = 0 
    for j in range(len(arr)):
        if(arr[i][j] == dot):
            garoN += 1
        else:
            garoN = 0
        if(garoN==2):
            garoresult += 1

        if(arr[j][i] == dot):
            seroN += 1
        else:
            seroN = 0
        if(seroN==2):
            seroresult += 1
            


print(garoresult,seroresult)