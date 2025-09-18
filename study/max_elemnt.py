def find_max_element(arr, left, right):
    if left == right:
        return arr[left]
    
    mid = (left + right) // 2

    max_left = find_max_element(arr, left, mid)
    max_right = find_max_element(arr, mid + 1, right)

    return max(max_left, max_right)


arr = [123, 32, 123, 12, 31, 23, 123, 123, 89898989]

print(find_max_element(arr))