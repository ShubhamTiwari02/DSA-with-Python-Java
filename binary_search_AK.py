# ========= Binary search DSA ============
allData = [12,16,23,45,35,60,55,63]
data = sorted(allData)
target = int(input("Enter number: "))
beg = len(data) - (len(data) - 1)
end = len(data)
mid = int((beg+end)/2)
loc = 0

if target < data[-1]:
    for i in range(len(data)):
        if beg <= end and target != data[mid]:
            if target < data[mid]:
                end = mid - 1
            else:
                beg = mid + 1
        mid = int((beg+end)/2)

    if data[mid] == target:
        loc = mid

print(loc+1)