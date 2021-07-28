def linearsearch(list, n, key):
    for i in range(0, n):
        if (list[i] == key):
            return i
    return -1

list = [1, 2, 3, 4, 5]
key = 4

n = len(list)
res = linearsearch(list, n, key)

if(res == -1):
    print("not found")
else:
    print("found",res)
