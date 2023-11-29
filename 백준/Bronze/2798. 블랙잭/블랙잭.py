import sys
from itertools import combinations
input = sys.stdin.readline

n, m = map(int, input().split())

inp = list(map(int, input().split()))

arr = list(combinations(inp, 3))

result = []
for x in arr:
    if sum(x) <= m:
        result.append(sum(x))

print(max(result))
