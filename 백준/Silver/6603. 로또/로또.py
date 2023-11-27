from itertools import combinations

while (True):
    li = []
    a = list(map(int, input().split()))
    if a[0] == 0:
        break
    for i in range(1, len(a)):
        li.append(a[i])
    arr = list(combinations(li, 6))
    for x in arr:
        print(*x)
    print()