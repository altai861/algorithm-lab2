import unittest
from insertion_sort import insertion_sort

class TestInsertionSort(unittest.TestCase):
    def test_sorted_list(self):
        arr = [1, 2, 3, 6, 9, 123, 132]
        result = [1, 2, 3, 6, 9, 123, 132]
        self.assertEqual(insertion_sort(arr), result)

    def test_reverse_sorted_list(self): # reverse sorted list
        arr = [542, 123, 34, 12, 3, 1, 0, -6]
        result = [-6, 0, 1, 3, 12, 34, 123, 542]
        self.assertEqual(insertion_sort(arr), result)
        
    def test_unsorted_list(self): # unsorted list
        arr = [34, 2, 32, 65, 34, 89, 2, 21, -98, 100]
        result = [-98, 2, 2, 21, 32, 34, 34, 65, 89, 100]
        self.assertEqual(insertion_sort(arr), result)
        
    def test_empty_list(self): # empty list
        arr = []
        result = []
        self.assertEqual(insertion_sort(arr), result)
        
    def test_with_duplicates(self): # test with duplicate elements
        arr = [1, 1, 5, 5, 1, 1, 2, 3, 4, 1, 1, 4, 100, 100, 101, 102, 123]
        result = [1, 1, 1, 1, 1, 1, 2, 3, 4, 4, 5, 5, 100, 100, 101, 102, 123]
        self.assertEqual(insertion_sort(arr), result)
        
    def test_with_one_element(self): # one element
        arr = [42]
        result = [42]
        self.assertEqual(insertion_sort(arr), result)
        
        
if __name__ == '__main__':
    unittest.main()