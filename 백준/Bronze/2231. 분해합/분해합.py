n = int(input())

arr =[]
for i in range(1,n):
    sum = i
    a = str(i)
    for x in a:
        sum += int(x)
    if(sum == n):
        arr.append(i)

if(arr):
    print(arr[0])
else:
    print(0)