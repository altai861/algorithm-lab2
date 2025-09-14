def insertion_sort(arr):
    n = len(arr)
    for i in range(1, n):
        key = arr[i]
        
        j = i - 1
        
        while j >= 0 and arr[j] > key:
            arr[j + 1] = arr[j]
            j = j - 1
        arr[j + 1] = key
        
    return arr
        

arr =[1, 1, 5, 5, 1, 1, 2, 3, 4, 1, 1, 4, 100, 100, 101, 102, 123]

print(insertion_sort(arr))