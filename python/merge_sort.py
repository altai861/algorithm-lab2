def merge(left, right):
    merged_list = []
    i = j = 0
    
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            merged_list.append(left[i])
            i += 1
        else:
            merged_list.append(right[j])
            j += 1
    
    merged_list.extend(left[i:])
    merged_list.extend(right[j:])
    
    return merged_list            

def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    
    mid = len(arr) // 2
    
    left_half = merge_sort(arr[:mid])
    right_half = merge_sort(arr[mid:])
    
    return merge(left_half, right_half)

def recursive_binary_search(arr, target, l, r):
    if l > r:
        return -1
    
    mid = (l + r) // 2
    
    if arr[mid] == target:
        return mid
    
    elif arr[mid] > target:
        return recursive_binary_search(arr, target, l, mid - 1)
    
    else:
        return recursive_binary_search(arr, target, mid + 1, r)
    
    
arr = [12, 11, 13, 5, 6, 7]
result = merge_sort(arr)


print(recursive_binary_search(result, 12, 0, len(result)))
