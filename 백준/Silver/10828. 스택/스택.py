import sys
n = int(sys.stdin.readline())
stack = []
for _ in range(n):
    a = sys.stdin.readline().split()
    if a[0] == "push":
        stack.append(int(a[1]))
    elif a[0] ==  "pop":
        if stack:
            print(stack.pop())
        else:
            print(-1)
    elif a[0] == "size":
        print(len(stack))
    elif a[0] == "empty":
        if stack:
            print(0)
        else:
            print(1)
    elif a[0] == "top":
        if stack:
            print(stack[-1])
        else:
            print(-1)