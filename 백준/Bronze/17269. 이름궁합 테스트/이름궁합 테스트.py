n,m = map(int,input().split())

a,b = input().split()

a = list(a)
b = list(b)

arr = []
alpha = [3,2,1,2,4,3,1,3,1,1,3,1,3,2,1,2,2,2,1,2,1,1,1,2,2,1]
result = []
for i in range(max(len(a),len(b))):
    try:
        arr.append(a[i])
    except:
        pass
    try:
        arr.append(b[i])
    except:
        pass
for x in arr:
    result.append(alpha[ord(x) - 65])

while(True):
    if(len(result)==2):
        break
    bascket = []
    for i in range(len(result) - 1):
        s = 0
        s = result[i] + result[i+1]

        bascket.append(s%10)
    result = []
    for i in range(len(bascket)):
        result.append(bascket[i])
    
for i in range(len(result)):
    result[i] = str(result[i])
if(result[0] == '0'):
    print(result[1] + "%")
else:
    answer = "".join(result)
    print(answer + "%")

    