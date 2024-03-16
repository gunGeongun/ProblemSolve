for _ in range(int(input())):
    a,b = map(int,input().split())
    sum = 0
    if (a==1):
        sum += 5000000
    elif(a>=2 and a<=3):
        sum += 3000000
    elif(a>=4 and a<=6):
        sum += 2000000
    elif(a>=7 and a<=10):
        sum += 500000
    elif(a>=11 and a <=15):
        sum += 300000
    elif(a>=16 and a<=21):
        sum  += 100000
    else:
        sum += 0
    if (b==1):
        sum += 5120000
    elif(b>=2 and b<=3):
        sum += 2560000
    elif(b>=4 and b<=7):
        sum += 1280000
    elif(b>=8 and b<=15):
        sum += 640000
    elif(b>=16 and b <=31):
        sum += 320000
    else:
        sum+=0
    print(sum)