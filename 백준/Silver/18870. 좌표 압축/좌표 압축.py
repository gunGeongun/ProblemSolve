# 좌표압축이란
# 예를 들어 1,50,1000,50000 이면 1,2,3,4 의 순서대로 매핑하여 나타내는 것
arr = []
n = int(input())
a = list((map(int, input().split())))
b = list(set(a))
b.sort()

index = [i for i in range(len(b))]

# 딕셔너리로 {-10:0,-9:1,2:2 ,4:3} 형태로 인덱스와 매핑하여 저장
index_dict = {key: value for key, value in zip(b, index)}

for x in a:
    print(index_dict[x], end=" ")