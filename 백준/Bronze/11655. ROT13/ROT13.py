a = input()

result = ''
for x in a:
    if 'a' <= x and x <= 'z':
        x = ord(x)+13
        if x > 122:
            x -= 26
        result += chr(x)
    elif 'A' <= x and x <= 'Z':
        x = ord(x)+13
        if x > 90:
            x -= 26
        result += chr(x)
    else:
        result += x

print(result)
