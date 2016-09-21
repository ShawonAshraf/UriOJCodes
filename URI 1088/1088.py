# URI 1088

test_case = 0
data = []
num_moves = 0
temp = []
n = 10000

for i in range(n):
    temp.append(-1)


def merge(start, divide, end):
    i, j, k = start, divide, start
    global num_moves

    while i < divide and j < end:
        if data[i] <= data[j]:
            temp[k] = data[i]
            i += 1
        else:
            temp[k] = data[j]
            j += 1
            num_moves += divide - i
        k += 1


def mergesort(s, e):
    if s < e:
        q = int((s + e) / 2)
        mergesort(s, q)
        mergesort(q + 1, e)
        merge(s, q + 1, e)


def do_1088():
    global num_moves
    while True:
        input_data = input()
        if len(input_data) == 1:
            break

        else:
            for i in input_data.split(" "):
                data.append(int(i))

            test_case = data[0]
            mergesort(1, len(data) - 1)

            if num_moves % 2:
                print("Marcelo")
            else:
                print("Carlos")


do_1088()
