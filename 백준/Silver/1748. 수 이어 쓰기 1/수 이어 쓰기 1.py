n = input()
result = 0

for i in range(1, len(n)):
    result += 9 * 10**(i-1) * i # 9* 10**(i-1) 은 각자리수의 숫자의 갯수(ex..1자리수면 1~9 9개 2자리수면 10~99 90개)
                                # i를 곱해준 이유는 2자리숫자(10~99)일때는 문자가 2개씩이기때문에 자리수만큼 곱해줘야 총 숫자의 개수를 구할수있음

result += (int(n)-10**(len(n)-1)+1) * len(n) # 마지막 자릿수는 자릿수의 모든 범위를 구하는게 아니기 때문에
                                             # 120이라하면 100~120의 갯수만 구하면됨
                                             # +1은 100이 포함되기때문에 해준 것
                                             

print(result)


