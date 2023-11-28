from collections import deque
n, k = map(int, input().split())

arr = deque([i for i in range(1, n+1)])
result = []
while arr:
    for i in range(k-1):
        arr.append(arr.popleft())
    result.append(arr.popleft())

print('<', end="")
for i in range(len(result)):
    if i == len(result)-1:
        print("%d" % (result[i]), end="")
    else:
        print("%d, " % (result[i]), end="")
print('>')
