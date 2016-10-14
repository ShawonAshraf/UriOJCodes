factorials = []
for i in range(21):
    factorials.append(0)

factorials[0] = 1
factorials[1] = 1

for i in range(2, 20):
    factorials[i] = factorials[i - 1] * i


while(True):
    line = input()
    if line == "":
        break
    nums = line.split(" ")

    a = int(nums[0])
    b = int(nums[1])

    sum = factorials[a] + factorials[b]
    print(sum)
