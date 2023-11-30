a = input()

stack = []
result = 0
for i in range(len(a)):
    if a[i] == '(': # ( 이라면 스택에 추가
        stack.append(a[i])
    else:
        if a[i-1] == '(': # 이전 괄호가 (라면 레이져 스택에서 pop 후 result에 스택에 쌓인 ( 개수만큼 더해줌
            stack.pop()
            result += len(stack)
        else: # ) 라면 쇠막대기 하나만 추가
            stack.pop()
            result += 1

print(result)
