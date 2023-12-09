while (1):
    try:
        n = list(input())
        lower = 0
        upper = 0
        num = 0
        space = 0
        for x in n:
            x = ord(x)
            if 97 <= x and x <= 122:
                lower += 1
            elif 65 <= x and x <= 90:
                upper += 1
            elif 48 <= x and x <= 57:
                num += 1
            else:
                space += 1
        print(lower, upper, num, space)
    except EOFError:
        break
