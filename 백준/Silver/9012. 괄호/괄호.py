def check(exp):
    stack = []
    for x in exp:
        if x == '(':
            stack.append(x)
        else:
            if not stack:
                return 0
            ch = stack.pop()
            while ch != '(':
                ch = stack.pop()
    if stack:
        return 0
    else:
        return 1


for _ in range(int(input())):
    a = input()
    if check(a) == 0:
        print('NO')
    else:
        print('YES')
