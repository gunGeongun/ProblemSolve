white = []
black = []
for i in range(8):
    if i%2 == 0:
        a = input()
        white.append(a)
    else:
        a = input()
        black.append(a)
cnt = 0
for x in white:
    for i in range(len(x)):
        if (i%2) == 0:
            if x[i] == 'F':
                cnt += 1
for x in black:
    for i in range(len(x)):
        if (i%2) != 0:
            if x[i] == 'F':
                cnt += 1

print(cnt)