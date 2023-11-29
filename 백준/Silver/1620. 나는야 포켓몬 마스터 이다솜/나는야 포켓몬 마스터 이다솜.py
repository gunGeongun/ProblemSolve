import sys
input = sys.stdin.readline
n, k = map(int, input().split())

name_dict = {}

for i in range(n):
    a = input().strip()
    name_dict.update({a: str(i+1)})
    name_dict.update({str(i+1): a})

for _ in range(k):
    print(name_dict[str(input().strip())])
