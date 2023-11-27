n , k = map(int,input().split())

arr  = [i for i in range(1,n+1)]
num = 0

result = []

for i in range(n):
    num += k-1
    if num >= len(arr):
        num = num % len(arr)

    result.append(arr.pop(num))

print("<",end="")
for i in range(len(result)):
    if i == len(result)-1 :
        print(result[i],end="")
    else:
        print(result[i],end=", ")
print(">")

