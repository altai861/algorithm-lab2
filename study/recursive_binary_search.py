def binary_search(arr, target, l, r):

    if l > r:
        return -1
    mid = (l + r) // 2

    if target == arr[mid]:
        return mid
    elif target < arr[mid]:
        return binary_search(arr, target, l, mid - 1)
    else:
        return binary_search(arr, target, mid + 1, r)
    

arr = [1, 12, 123, 123123, 123123123]

ind = binary_search(arr, 123, 0, len(arr))

print(ind)

    