a = input()
b = input()

alpha_a = [0 for _ in range(26)]
alpha_b = [0 for _ in range(26)]

for x in a:
    alpha_a[ord(x)-97] += 1
for x in b:
    alpha_b[ord(x)-97] += 1

count = 0
for i in range(len(alpha_a)):
    if alpha_a[i] != alpha_b[i]:
        if alpha_a[i] > alpha_b[i]:
            count += (alpha_a[i]-alpha_b[i])
        else:
            count += (alpha_b[i]-alpha_a[i])

print(count)
