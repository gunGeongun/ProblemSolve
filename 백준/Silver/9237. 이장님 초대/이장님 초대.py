n = int(input())

a = list(map(int,input().split()))

a.sort(reverse=True)
for i in range(1,n+1):
    a[i-1] += i

print(max(a)+1)
