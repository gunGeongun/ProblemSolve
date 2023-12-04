color = ['black', 'brown', 'red', 'orange', 'yellow',
         'green', 'blue', 'violet', 'grey', 'white']

first = input()
second = input()
third = input()

result = ''
f = str(color.index(first))
s = str(color.index(second))
if color.index(third) == 0:
    t = ''
else:
    t = '0' * color.index(third)
result += f+s+t
print(int(result))