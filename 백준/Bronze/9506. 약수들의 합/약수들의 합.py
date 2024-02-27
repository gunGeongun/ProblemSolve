while(True):
    n = int(input())
    if(n<0):
        break
    result = 0
    li = []
    for i in range(1,n):
        if (n % i) == 0:
            li.append(i)
    if(sum(li)==n):
        print("%d ="%n,end ="")
        for x in li:
            if(x != li[-1]):
                print(" %d +"%x,end="")
            else:
                print(" %d"%x)
    else:
        print("%d is NOT perfect."%n)

