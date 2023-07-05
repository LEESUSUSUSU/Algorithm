def solution(a, b):
    newa = str(a)+str(b)
    newb = str(b)+str(a)
    
    if(newa>newb):
        answer = newa
    else:
        answer = newb
    
        
    return int(answer)