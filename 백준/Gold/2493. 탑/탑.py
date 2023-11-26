import sys
arr = []
result = []
input = sys.stdin.readline
n = int(input())

a = list(map(int, input().split()))

for i in range(n):
    while arr:
        if arr[-1][1] > a[i]:
            result.append(arr[-1][0]+1)
            break
        else:
            arr.pop()
    if not arr:
        result.append(0)
    arr.append([i, a[i]])

print(*result)

# 역순으로 생각하지 않고 정방향으로 생각하여 6 9 5 7 4 순으로 수신여부 측정
#  [인덱스번호,높이]가 추가되는 arr, 수신할 탑의 인덱스 번호가 저장되는 result 
# 만약 arr이 비어 있다면 수신할 탑이 없는(현재 탑보다 큰 높이의 탑이 없는) 상태이기때문에 reuslt에 0 추가
# arr에는 현재 탑의 [인덱스번호,높이] 추가 
# 만약 arr이 비어 있지않다면 , arr의 top의 높이와 현재 탑의 높이를 비교하여 
# arr의 top이 더 크다면 -> result에 arr의 top 인덱스에 +1 (탑의 번호)값을 추가
# arr의 top이 더 작다면 -> arr pop()

# 과정
#  6 9 5 7 4 
#  현재 탑 6 - arr이 비어있음 -> 수신할 탑 X -> result에 0 추가 -> arr에 [0,6] 추가
#  현재 탑 0 - arr이 비어있지 않음 -> top인 6보다 큼 -> arr pop() -> arr이 비어있음-> result에 0 추가 -> arr에 [1,9]추가
#  현재 탑 5 - arr이 비어있지 않음 -> top인 9보다 작음 -> result에 9의 인덱스+1인 2 추가 ->arr에 [2,5] 추가
#  탑 4까지 진행 후 result는 [0,0,2,2,4]