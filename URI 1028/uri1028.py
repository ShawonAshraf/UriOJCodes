def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a%b)


n = int(input())
for i in range(n):
    a, b = input().split(" ")
    result = gcd(int(a), int(b))
    print(result)
