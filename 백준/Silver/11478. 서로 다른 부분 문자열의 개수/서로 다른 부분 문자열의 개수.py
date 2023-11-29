import sys
input = sys.stdin.readline
n = input().strip()
arr = set()

for i in range(len(n)):
    for j in range(i, len(n)):
        arr.add(n[i:j+1])

print(len(arr))
