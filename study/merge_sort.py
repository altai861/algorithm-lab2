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

arr = [13, 1, 2, 1, 32, 13, 11, 99, 100, 78]

ordered = merge_sort(arr)

print(ordered)