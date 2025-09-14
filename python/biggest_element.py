def find_max_recursive(arr):
    """
    Finds the biggest element in a list using a divide-and-conquer approach.
    """
    # Base case: If the list has one or zero elements, it is already the biggest.
    if len(arr) <= 1:
        return arr[0] if arr else None

    # Divide the list into two halves
    mid = len(arr) // 2
    left_half = arr[:mid]
    right_half = arr[mid:]

    # Conquer: Recursively find the biggest element in each half
    max_left = find_max_recursive(left_half)
    max_right = find_max_recursive(right_half)

    # Combine: Return the maximum of the two halves
    return max(max_left, max_right)

# Example usage:
my_list = [1, 23, 4, 1, 123]
biggest_element = find_max_recursive(my_list)

if biggest_element is not None:
    print(f"The biggest element is: {biggest_element}")
else:
    print("The list is empty.")