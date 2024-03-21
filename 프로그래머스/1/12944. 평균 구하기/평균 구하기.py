def solution(arr):
    answer = 0
    for x in arr:
        answer += x
    answer /= len(arr)
    return answer