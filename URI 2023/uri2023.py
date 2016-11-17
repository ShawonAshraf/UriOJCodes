names = []

while True:
    try:
        names.append(input())
    except EOFError:
        break

lastName = names[0]
for name in names:
    if name.lower() > lastName.lower():
        lastName = name

print(lastName)
