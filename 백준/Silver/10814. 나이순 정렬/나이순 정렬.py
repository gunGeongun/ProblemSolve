arr = []
for _ in range(int(input())):
    age, name = input().split()
    arr.append([int(age), name])

arr.sort(key=lambda x: (x[0]))

for x in arr:
    print(x[0], x[1])
