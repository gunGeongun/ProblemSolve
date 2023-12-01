for _ in range(int(input())):
    n = int(input())
    if n > 0:
        arr = [0] * (n+1)
        arr[1] = 1
        for i in range(2, n+1):
            arr[i] = arr[i-2]+arr[i-1]
        print(arr[n-1], arr[n])
    else:
        print(1, 0)
