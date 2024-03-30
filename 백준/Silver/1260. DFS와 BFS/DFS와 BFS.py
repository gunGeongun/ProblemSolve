from collections import deque
N, M, V = map(int, input().split())
graph = [[] for _ in range(N + 1)]


for _ in range(M):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)
for i in graph:
    i.sort()
visited1 = [False] * len(graph)
visited2 = [False] * len(graph)
def dfs(graph,node,visited):
    visited[node] = True
    print(node,end =" ")
    for i in graph[node]:
        if not visited[i]:
            dfs(graph,i,visited)

def bfs(graph,node,visited):
    q = deque([node])
    visited[node] = True
    while q:
        x =q.popleft()
        print(x,end=" ")
        for i in graph[x]:
            if not visited[i]:
                q.append(i)
                visited[i] = True
dfs(graph,V,visited1)
print()
bfs(graph,V,visited2)
