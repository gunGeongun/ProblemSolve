n,m = map(int,input().split())


left = 1
right = m
count = 0
for _ in range(int(input())):
    pos = int(input())

    if( pos>=left and pos<=right):
        continue
    elif left > pos:
        count += (left - pos)
        right -= (left -pos)
        left = pos
    else:
        count += (pos - right)
        left += (pos - right)
        right = pos
    
print(count)