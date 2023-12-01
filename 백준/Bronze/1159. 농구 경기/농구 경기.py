arr = [0 for _ in range(26)]

for _ in range(int(input())):
    a = input()
    arr[ord(a[0])-97] += 1

cnt = 0
for i in range(len(arr)):
    if arr[i] >= 5:
        print(chr(i+97), end="")
        cnt += 1

if cnt == 0:
    print("PREDAJA")