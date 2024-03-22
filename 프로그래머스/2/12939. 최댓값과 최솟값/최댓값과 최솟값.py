def solution(s):
    arr = s.split(" ")
    for i in range(len(arr)):
        arr[i] = int(arr[i])
    
    result = ""
    result += str(min(arr))
    result += " "
    result += str(max(arr))
    return result