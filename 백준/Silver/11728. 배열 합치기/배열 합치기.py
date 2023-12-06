n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

for x in b:
    a.append(x)
a.sort()
print(*a)
