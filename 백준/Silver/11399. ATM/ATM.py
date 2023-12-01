n = int(input())
a = list(map(int, input().split()))

result = 0

a.sort()
for i in range(1, len(a)):
    a[i] = a[i-1] + a[i]
print(sum(a))
