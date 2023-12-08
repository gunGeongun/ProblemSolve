n = int(input())

num = 1000-n

oback = num // 500
num = num%500
back = num // 100
num  = num % 100
oship = num // 50
num = num%50
ship = num // 10
num = num % 10
oh = num // 5
num = num % 5
ill = num // 1

cnt = 0

cnt += oback + back + oship +ship+oh+ill

print(cnt)