hamarr = []
drinkarr = []
for _ in range(3):
    hamarr.append(int(input()))
for _ in range(2):
    drinkarr.append(int(input()))
hamarr.sort()
drinkarr.sort()

print(hamarr[0]+drinkarr[0]-50)
