from collections import deque

n, m = map(int, input().split())
dq = deque([i for i in range(1, n+1)])

a = list(map(int, input().split()))
cnt = 0
for x in a:
    while True:
        if dq[0] == x: #뽑으려는 숫자가 맨앞에 있으면 그냥 뽑음
            dq.popleft()
            break
        else:
            if dq.index(x) <= (len(dq)//2): #뽑으려는 숫자의 위치가 배열중간보다 앞에 있으면 2번 명령 수행
                while dq[0] != x:
                    dq.append(dq.popleft())
                    cnt += 1
            else: # 뽑으려는 숫자의 위치가 배열중간보다 뒤에 있으면 3번 명령수행
                while dq[0] != x:
                    dq.appendleft(dq.pop())
                    cnt += 1
print(cnt)
