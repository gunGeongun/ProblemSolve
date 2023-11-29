import sys
input = sys.stdin.readline
n, k = map(int, input().split())

name_dict = {}

for i in range(n):
    a = input().strip()
    name_dict.update({a: 0})

for _ in range(k):
    b = input().strip()
    if b in name_dict:
        name_dict.update({b: 1})
arr = [k for k, v in name_dict.items() if v == 1]
arr.sort()
print(len(arr))
for x in arr:
    print(x)