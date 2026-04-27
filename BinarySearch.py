#Binary Search:-->
data = list(map(int, input("Enter your Elements :").split())) #ex. - 4 54 32 34 55 56 66 77 22 44 11 88  

item = int(input("What is to be searched: "))
beg = 0
end = len(data) - 1
counter = 0
mid = int((beg+end)/2)

for i in range(len(data)):
    if data != sorted:
        data.sort()

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
