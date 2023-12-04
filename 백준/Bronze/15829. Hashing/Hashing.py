arr = [i for i in range(1, 27)]

n = int(input())
a = input()
result = 0
for i in range(len(a)):
    result += ((ord(a[i])-96) * (31**i))
print(result % 1234567891)
