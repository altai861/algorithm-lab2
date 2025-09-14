import unittest
from merge_sort import recursive_binary_search

class TestRecursiveBinarySearch(unittest.TestCase):
    def test_1(self):
        arr = [1, 1, 1, 2, 3, 5, 10, 12, 19, 20, 20, 21]

        result = recursive_binary_search(arr, 1, 0, len(arr))

        expected = [0, 1, 2]

        self.assertIn(result, expected)

    def test_2(self):
        arr = [2, 100, 1000, 2000, 2999, 3000, 3001]

        result = recursive_binary_search(arr, 10, 0, len(arr))

        expected = -1

        self.assertEqual(result, expected)

    def test_3(self): # giving unsorted list
        arr = [123, 32, 12, 3, 1, 56, 5, 34, 2, 65, 3, 4, 3, 2, 1]

        result = recursive_binary_search(arr, 12, 0, len(arr))

        expected = -1

        self.assertEqual(result, expected)

    def test_4(self):
        arr = [100, 101, 200, 201, 202, 202]

        result = recursive_binary_search(arr, 202, 0, len(arr))

        expected = [4, 5]
        self.assertIn(result, expected)

    def test_5(self):
        arr = [100, 1001, 1002, 9999, 10101, 23222, 23333]

        result = recursive_binary_search(arr, 1002, 0, len(arr))

        expected = 2

        self.assertEqual(result, expected)


if __name__ == "__main__":
    unittest.main()