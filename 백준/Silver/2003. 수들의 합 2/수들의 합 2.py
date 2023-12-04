#투포인터
n, m = map(int, input().split())
arr = list(map(int, input().split()))
cnt = 0
interval_sum = 0
end = 0

for start in range(n):
    while interval_sum < m and end < len(arr):
        interval_sum += arr[end]
        end += 1
    if interval_sum == m:
        cnt += 1
    interval_sum -= arr[start]
print(cnt)
