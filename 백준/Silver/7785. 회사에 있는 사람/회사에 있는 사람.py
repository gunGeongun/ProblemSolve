namearr = []
logarr = []
for _ in range(int(input())):
    name, log = input().split()
    namearr.append(name)
    logarr.append(log)

z = dict(zip(namearr, logarr))
result = [k for k, v in z.items() if v == 'enter']
result.sort(reverse=True)
for x in result:

    print(x)