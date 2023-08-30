def solution(my_string):
    # 52개의 정수 배열을 0으로 초기화합니다.
    counts = [0] * 52
    
    # 문자열을 순회하면서 알파벳의 개수를 세어 counts 배열에 더합니다.
    for char in my_string:
        if 'A' <= char <= 'Z':
            # 대문자 알파벳인 경우, counts 배열의 해당 인덱스에 더합니다.
            counts[ord(char) - ord('A')] += 1
        elif 'a' <= char <= 'z':
            # 소문자 알파벳인 경우, counts 배열의 해당 인덱스에 더합니다.
            counts[ord(char) - ord('a') + 26] += 1
    
    return counts