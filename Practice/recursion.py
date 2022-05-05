# calculate a^b

def findPower(a, b):
    if b == 1:
        return a
    return findPower(a * a, b-1)

print(findPower(2, 4))