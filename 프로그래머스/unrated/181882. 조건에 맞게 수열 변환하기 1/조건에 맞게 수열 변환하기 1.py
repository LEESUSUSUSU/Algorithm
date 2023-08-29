def solution(arr):
    result = []

    for num in arr:
        if num >= 50 and num % 2 == 0:
            result.append(num // 2)  # 50 이상의 짝수는 2로 나누기
        elif num < 50 and num % 2 != 0:
            result.append(num * 2)   # 50 미만의 홀수는 2를 곱하기
        else:
            result.append(num)       # 그 외의 경우는 그대로 사용

    return result
