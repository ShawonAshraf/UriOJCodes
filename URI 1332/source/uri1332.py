# uri 1332 solution


numDict = {"one": 1, "two": 2, "three": 3}

testCases = int(input())
for i in range(testCases):
    num = input()
    l = len(num)

    if(l == 3):
        if(num[0] == "o" or num[l - 1] == "e" or num[1] == "n"):
            print(numDict["one"])
        else:
            print(numDict["two"])
    elif(l == 5):
        print(numDict["three"])
