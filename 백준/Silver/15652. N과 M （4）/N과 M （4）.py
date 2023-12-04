from itertools import combinations_with_replacement
n, m = map(int, input().split())
arr = list(combinations_with_replacement([i for i in range(1, n+1)], m))

for i in range(len(arr)):
    for j in range(len(arr[i])):
        print(arr[i][j], end=" ")
    print()
