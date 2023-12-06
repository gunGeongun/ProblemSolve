arr = []
for _ in range(int(input())):
    name, kor, eng, math = input().split()
    kor = int(kor)
    eng = int(eng)
    math = int(math)
    arr.append([name, kor, eng, math])
result = sorted(arr, key=lambda x: (-x[1], x[2], -x[3], x[0]))

for x in result:
    print(x[0])
