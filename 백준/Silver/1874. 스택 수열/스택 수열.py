arr = []
resultarr = []
inputnum = 1
state = 0
for _ in range(int(input())):
    n = int(input())
    while inputnum <= n:  # 1~n 까지 숫자를 스택에 넣음
        arr.append(inputnum)
        resultarr.append('+') # 숫자를 넣을때마다 +를 resultarr 에 넣어줌
        inputnum += 1
    if arr[-1] == n: #스택의 top과 n을 비교하고 같으면 pop
        arr.pop()
        resultarr.append('-')
    else: # 스택의 top과 n이 다르면 오류
        state = 1

if (state == 0):
    for x in resultarr:
        print(x)
else:
    print('NO')
