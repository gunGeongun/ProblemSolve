n = int(input())


def padoban(n):
    f[1] = 1
    f[2] = 1
    f[3] = 1
    f[4] = 2
    f[5] = 2
    f[6] = 3
    if (n > 6):
        for i in range(7, n+1):
            f[i] = f[i-5] + f[i-1]
    return f[n]


for _ in range(n):

    a = int(input())
    f = [0] * (a+7)  # DP 테이블 초기화
    print(padoban(a))