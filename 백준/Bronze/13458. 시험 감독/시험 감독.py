import sys
input = sys.stdin.readline
n = int(input())
a = list(map(int, input().split()))
b, c = map(int, input().split())
cnt = 0
for i in range(len(a)):
    if (a[i]-b) <= 0:
        a[i] = 0
        cnt += 1
    else:
        a[i] -= b
        cnt += 1
for x in a:
    if (x % c) != 0:
        cnt += (x//c)+1
    else:
        cnt += (x//c)

print(cnt)
