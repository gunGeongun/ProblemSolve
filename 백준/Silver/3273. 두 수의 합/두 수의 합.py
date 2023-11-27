#투포인터로 해결
n = int(input())
arr = sorted(list(map(int, input().split()))) #투포인터를 위한 배열 정렬
x = int(input())
cnt = 0
start = 0
end = len(arr)-1

while start < end:
    hap = arr[start] + arr[end]
    if hap == x:
        cnt += 1
    if hap < x: # 합이 x보다 작을경우 합을 늘려줘야됨 start+=1
        start += 1
    else: # 합이 x보다 클 경우 합을 줄어줘야됨 end -=1
        end -= 1
print(cnt)
