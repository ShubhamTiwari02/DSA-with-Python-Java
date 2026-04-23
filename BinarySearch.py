#Binary Search:-->
data = [4,6,32,34,55,56,66,77,77,87,88,89,99,111,222]

# item = 66 , beg = 1 , end = 15
beg = 0 
end = 14 
item = 77
counter = 0
mid = int((beg+end)/2)

for i in range(len(data)):
    if item < data[mid]:
        end = mid - 1
        mid = int((beg+end)/2)
    else:
        beg = mid + 1
        mid = int((beg+end)/2)
        counter += 1

if data[mid] == item:
    print("This is our item location in the data:-",mid)
else:
    print("Null")

