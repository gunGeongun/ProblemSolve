n,k  = map(int,input().split())

arr = []
for _ in range(n):
    arr.append(int(input()))

arr.reverse()

result = 0
for i in range(n):
    result += (k// arr[i])
    k = k%arr[i]

print(result)