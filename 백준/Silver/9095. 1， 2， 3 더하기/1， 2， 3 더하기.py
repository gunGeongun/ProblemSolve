def hap(n):
    if n == 1:
        return 1
    elif n == 2:
        return 2
    elif n == 3:
        return 4
    else:
        return hap(n-3)+hap(n-2)+hap(n-1)
# 점화식을 구했을때 1->1개 2->2개 3->4개 4->7개 5->13개 =  f(n)=f(n-3)+f(n-2)+f(n-1)


for _ in range(int(input())):
    print(hap(int(input())))
