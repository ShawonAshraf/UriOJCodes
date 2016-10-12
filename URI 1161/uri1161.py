def factorial(n):
    if(n <= 1):
        return 1
    else:
        return n * factorial(n - 1)

n = int(input())
m = int(input())

sum = factorial(n) + factorial(m)
print(sum)
