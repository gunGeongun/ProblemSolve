n = int(input())

arr = list(input())

score_sum = 0
bonus_sum = 0
score = 0

for x in arr:
    
    if(x == 'X'):
        bonus_sum = 0
    else:
        
        bonus_sum += 1
        score_sum += (score+ bonus_sum)
    score += 1
        

print(score_sum)