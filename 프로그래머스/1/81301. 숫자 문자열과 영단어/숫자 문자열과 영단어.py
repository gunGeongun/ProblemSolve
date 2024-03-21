def solution(s):
    arr = ["zero","one","two","three","four","five","six","seven","eight","nine"]
    result = []
    ch = ""
    for i in range(len(s)):
        if (s[i] in "0123456789"):
            result.append(int(s[i]))
        else:
            ch += s[i]
        if ch in arr:
            result.append(arr.index(ch))
            ch = ""
    answer = ""
    for x in result:
        answer += str(x)
    return int(answer)