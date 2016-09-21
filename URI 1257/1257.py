alphabets = "abcdefghijklmnopqrstuvwxyz"

def getValue(c, el_no, el_pos):
    pos = alphabets.find(c)
    value = pos + el_no + el_pos
    return value


# now to main task

tc = int(input())
for i in range(tc):
    ln = int(input())
    sum = 0
    for j in range(ln):
        el = input().lower()
        for x in range(len(el)):
            sum = sum + getValue(el[x], j, x)
    print(sum)
