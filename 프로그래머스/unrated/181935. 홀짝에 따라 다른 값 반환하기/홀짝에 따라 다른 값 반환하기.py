def solution(n):
    if n % 2 == 1:  # n이 홀수인 경우
        return sum(i for i in range(1, n+1, 2))  # 1부터 n까지 홀수의 합을 반환
    else:  # n이 짝수인 경우
        return sum(i**2 for i in range(2, n+1, 2))  # 2부터 n까지 짝수의 제곱의 합을 반환
