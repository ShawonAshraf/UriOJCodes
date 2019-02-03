L = int(input())
operation = str(input())

arr = []

for i in range(12):
    arRow = []
    for j in range(12):
        num = float(input())
        arRow.append(num)
    arr.append(arRow)

opRow = arr[L]

if operation == "S":
    result = sum(opRow)
    print(result)
else:
    result = sum(opRow) / float(len(opRow))
    print(result)
