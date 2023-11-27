arr = [i for i in range(10)]
cntarr = [0 for _ in range(10)]
n = list(input())
check = []

for obj in n:
    if obj == '6' or obj == '9':
        if cntarr[6] < cntarr[9]:
            cntarr[6] += 1
        else:
            cntarr[9] += 1
    else:
        cntarr[int(obj)] += 1


print(max(cntarr))
