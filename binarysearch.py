def binarysearch(lis, l, r, n):
    while(l<=r):
        mid = l+r//2
        if(lis[mid] == n):
            return mid
        elif(lis[mid]<n):
            l = mid +1
        else:
            r = mid -1
    return -1

lis = [ 2, 3, 4, 10, 40 ]
x = 10
  
result = binarysearch(lis, 0, len(lis)-1, x)
  
if result != -1:
    print ("Element is present at index % d" % result)
else:
    print ("Element is not present in array")