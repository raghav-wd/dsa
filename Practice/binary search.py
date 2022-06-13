l=[1,2,3,4,5,6,7,8,9]
to_be_searched=10
start = 0
end = len(l)-1
while start<=end:
    mid = start + (end-start)//2
    if l[mid]==to_be_searched:
        print("value found at ",mid)
        break
    elif to_be_searched>l[mid]:
        start = mid+1
    else:
        end = mid-1
else:
    print("Value not found")

