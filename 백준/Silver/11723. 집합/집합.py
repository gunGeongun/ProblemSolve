import sys
input = sys.stdin.readline
s = set()
for _ in range(int(input())):
    a = input().split()
    if a[0] == 'add':
        if a[1] not in s:
            s.add(a[1])
        else:
            continue
    elif a[0] == 'remove':
        if a[1] in s:
            s.discard(a[1])
        else:
            continue
    elif a[0] == 'check':
        if a[1] in s:
            print(1)
        else:
            print(0)
    elif a[0] == 'toggle':
        if a[1] in s:
            s.discard(a[1])
        else:
            s.add(a[1])
    elif a[0] == 'all':
        s = set([str(i) for i in range(1, 21)])
    elif a[0] == 'empty':
        s = set()
