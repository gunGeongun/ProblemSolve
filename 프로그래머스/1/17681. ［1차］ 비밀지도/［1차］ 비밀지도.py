def solution(n, arr1, arr2):
    firstmap = []
    secondmap = []
    result = ['' for _ in range(n)]
    for x in arr1:
        b = format(x, 'b')
        firstmap.append(b.zfill(n))
    for x in arr2:
        b = format(x, 'b')
        secondmap.append(b.zfill(n))
    for i in range(n):
        for j in range(n):
            if (firstmap[i][j] == '0') and (secondmap[i][j] == '0'):
                result[i]+=' '
            elif (firstmap[i][j] == '1') or (secondmap[i][j] == '1'):
                result[i]+='#'

                
    
 
    return result