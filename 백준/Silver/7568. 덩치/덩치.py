import sys
input = sys.stdin.readline
arr = []
for _ in range(int(input())):
    a, b = map(int, input().split())
    arr.append([a, b])

result = []
for i in range(len(arr)):
    cnt = 1
    for j in range(len(arr)):
        if (arr[i][0] < arr[j][0]) and (arr[i][1] < arr[j][1]):
            cnt += 1
    result.append(cnt)

print(*result)
