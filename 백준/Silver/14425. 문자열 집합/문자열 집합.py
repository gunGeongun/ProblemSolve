n, m = map(int, input().split())

narr = []
marr = []
for _ in range(n):
    narr.append(input())
for _ in range(m):
    marr.append(input())
cnt = 0

for x in marr:
    if x in narr:
        cnt += 1

print(cnt)
