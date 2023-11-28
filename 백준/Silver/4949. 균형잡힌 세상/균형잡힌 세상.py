def check(exp):
    stack = []
    for x in exp:
        if x == '(' or x == '[':
            stack.append(x)
        elif x == ')' or x == ']':
            if not stack:
                return 0
            ch = stack.pop()
            if (ch == '(' and x != ')') or (ch == '[' and x != ']'):
                return 0
    if stack:
        return 0
    else:
        return 1


while (True):
    a = input()
    if a == '.':
        break
    if check(a) == 0:
        print('no')
    else:
        print('yes')
