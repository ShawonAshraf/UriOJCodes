# uri 1332 solution


def getErrorPercentage(text, ref_str):
    counter = 0
    for i in range(3):
        if(ref_str[i] != text[i]):
            counter = counter + 1

    error_perc = counter / 3
    return error_perc


numDict = {"one": 1, "two": 2, "three": 3}

testCases = int(input())
for i in range(testCases):
    num = input().strip()
    l = len(num)

    if(l == 3):
        if(getErrorPercentage(num, "one") == (1 / 3) or num == "one"):
            print(numDict["one"])
        elif(getErrorPercentage(num, "two") == (1 / 3) or num == "two"):
            print(numDict["two"])
    elif(l == 5):
        print(numDict["three"])
