import sys
input = sys.stdin.readline
n, k = map(int, input().split())

a = set(map(int, input().split()))
b = set(map(int, input().split()))

cnt = 0
haparr = a | b
chaarr = a & b
for x in haparr:
    if x not in chaarr:
        cnt += 1

print(cnt)
