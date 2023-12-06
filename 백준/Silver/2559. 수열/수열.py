#슬라이딩 윈도우
N, K = map(int, input().split())
tem_list = list(map(int, input().split()))

part_sum = sum(tem_list[:K])
result = part_sum

for i in range(K, len(tem_list)):
    part_sum += tem_list[i] - tem_list[i-K]
    result = max(result, part_sum)

print(result)
