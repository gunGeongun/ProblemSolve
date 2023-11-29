import sys

a = list(input())

a.sort(reverse=True)

for x in a:
    print(x, end="")
