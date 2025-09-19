def merge(left, right):
    result = []
    
    i = j = 0
    
    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1
            
    result.extend(left[i:])
    result.extend(right[j:])
    
    
    return result

def sort(arr):
    if len(arr) <= 1:
        return arr
    
    mid = len(arr) // 2
    
    left_half = sort(arr[:mid])
    right_half = sort(arr[mid:])
    
    return merge(left_half, right_half)


arr = [23, 32, 123, 54, 23, 1, 32, 0, 23, -1]

result = sort(arr)

print(result)
