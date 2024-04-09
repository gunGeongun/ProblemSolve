from collections import deque
n=  int(input())
m = int(input())
v = 1
cnt =0
graph = [[False for _ in range(n+1)]for _ in range(n+1)]

for _ in range(m):
    a,b = map(int,input().split())
    graph[a][b] = True
    graph[b][a] = True

dfs_visited = [False] * (n+1)

def dfs(v):
    global cnt
    dfs_visited[v] = True
    cnt += 1
    for i in range(1,n+1):
        if not dfs_visited[i] and graph[v][i]:
            dfs(i)

dfs(v)
print(cnt-1)