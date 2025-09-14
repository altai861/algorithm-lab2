def find_max_recursive(arr, left=0, right=None):

    if left == right:
        return arr[left]

    mid = (left + right) // 2
    max_left = find_max_recursive(arr, left, mid)
    max_right = find_max_recursive(arr, mid + 1, right)

    return max(max_left, max_right)


my_list = [1, 23, 4, 1, 123]
biggest_element = find_max_recursive(my_list, 0, len(my_list) - 1)

if biggest_element is not None:
    print(f"The biggest element is: {biggest_element}")
else:
    print("The list is empty.")