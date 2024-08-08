n = int(input())

result = -1

for i in range(n // 3 + 1):
    if (n - 3 * i) % 5 == 0:
        result = i + (n - 3 * i) // 5
        break

print(result)