from collections import deque


oneline = []
n = int(input())
nowline = list(map(int, input().split()))
nowline = deque(nowline)

idx = 1

while nowline:
    if nowline[0] == idx: #현재 줄의 맨 앞사람이 간식을 받을 번호라면
        nowline.popleft()
        idx += 1 # 간식받는 번호 + 1
    else:
        oneline.append(nowline.popleft()) #아니라면 한명씩설수있는공간에 추가
    while oneline: #한명씩설수있는 공간이 현재 줄서있는곳보다 순번이 빠를 경우도 고려해야함
        if oneline[-1] == idx:
            oneline.pop()
            idx += 1
        else:
            break

if oneline:
    print("Sad")
else:
    print("Nice")
