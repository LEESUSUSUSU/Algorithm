def solution(a, b, c):
    if a == b == c:  # 세 숫자가 모두 같은 경우
        score = (a + b + c) * (a ** 2 + b ** 2 + c ** 2) * (a ** 3 + b ** 3 + c ** 3)
    elif a != b and b != c and a != c:  # 세 숫자가 모두 다른 경우
        score = a + b + c
    else:  # 두 숫자가 같고 나머지 숫자는 다른 경우
        score = (a + b + c) * (a ** 2 + b ** 2 + c ** 2)
    return score
