n = int(input())

f1 = 0  # 함수의 실행 횟수
f = [0] * (n+1)  # DP 테이블 초기화

def fib_dp(n):
    f[1] = 1
    f[2] = 1
    global f1
    for i in range(3, n+1):
        f[i] = f[i-1] + f[i-2]
        f1 += 1
    return f[n]

print(fib_dp(n), f1) #코드 1의 실행횟수는 피보나치 n번째 수랑 동일함