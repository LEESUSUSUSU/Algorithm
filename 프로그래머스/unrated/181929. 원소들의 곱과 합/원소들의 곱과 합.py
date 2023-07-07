def solution(num_list):
    total_sum = sum(num_list)  # 리스트의 합을 계산합니다.
    total_product = 1
    for num in num_list:
        total_product *= num  # 리스트의 원소들을 곱합니다.
    if total_product < total_sum ** 2:  # 곱이 합의 제곱보다 작은 경우
        return 1
    else:
        return 0
