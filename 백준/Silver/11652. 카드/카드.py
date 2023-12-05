dic = {}
for _ in range(int(input())):
    a = int(input())
    if a not in dic:
        dic[a] = 1
    else:
        dic[a] += 1
sorted_dic = dict(sorted(dic.items()))
tmp = max(sorted_dic, key=sorted_dic.get)
print(tmp)
