from collections import deque


r = input()
test_case = int(r)

seq = []
for i in range(1, test_case + 1):
    seq.append(i)

# print(seq)

dq = deque(seq)
# print("len_sq = {} & len_dq = {}".format(len(seq), len(dq)))

print("Discared Cards :", end=' ')
while(len(dq) != 1):
    discared = dq.popleft()
    if len(dq) == 1:
        print(discared)
    else:
        print(discared, end=", ")
    goes_last = dq.popleft()
    dq.append(goes_last)

print("Remaining Cards : ", dq.pop())
