a = input()
if '0' not in a:
    print(-1)
else:
    tmp = 0
    for x in a:
        tmp += int(x)
    if tmp % 3 != 0:
        print(-1)
    else:
        b = sorted(a, reverse=True)
        result = ''.join(b)
        print(result)
#30의 배수의 조건 : 3의 배수이면서 10의 배수를 만족해야함
# 10의 배수 -> 끝자리가 0이어야하기때문에 0이 없으면 -1 출력
# 3의 배수 -> 각 자리수의 합이 3의 배수여야함
# 최종적으로 30의 배수가 되는 가장 큰수는 내림차순 정렬한대로 꺼내면됨
