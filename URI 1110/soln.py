from collections import deque


while True:

    r = input()
    test_case = int(r)

    if test_case == 0:
        break
    else:
        seq = []
        for i in range(1, test_case + 1):
            seq.append(i)

        dq = deque(seq)

        print("Discared Cards:", end=' ')
        while len(dq) > 1:
            discared = dq.popleft()
            if len(dq) == 1:
                print(discared)
            else:
                print(discared, end=", ")
            goes_last = dq.popleft()
            dq.append(goes_last)

        print("Remaining Card: {}".format(dq.pop()))
