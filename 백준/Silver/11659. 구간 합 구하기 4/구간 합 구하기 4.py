import sys
input = sys.stdin.readline
n, m = map(int, input().split())
a = list(map(int, input().split()))
psum = [0]
tmp = 0
for x in a:
    tmp += x
    psum.append(tmp)
for _ in range(m):
    i, j = map(int, input().split())
    result = psum[j] - psum[i-1]
    print(result)
