n = int(input())

f = [0] * 1000001  # DP 테이블 초기화

f[1] = 1
f[2] = 2
for i in range(3, n+1):
    f[i] = (f[i-2] + f[i-1]) % 15746
print(f[n])
