import unittest
from biggest_element import find_max_recursive


class TestBiggestElement(unittest.TestCase):
    def test_1(self):
        arr = [12, 12, 12, 12, 12, 100, -100]

        self.assertEqual(find_max_recursive(arr), max(arr))

    def test_2(self):
        arr = [121, -123, 123, 435, 2, 1, 100, 200, -1012, 12000]

        self.assertEqual(find_max_recursive(arr), max(arr))

    def test_3(self):

        arr = [100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100]

        self.assertEqual(find_max_recursive(arr), max(arr))

    def test_4(self):
        arr = [-100, -123, -1202, -20303, -1, -2, 0]

        self.assertEqual(find_max_recursive(arr), max(arr))

    def test_5(self):
        arr = [123232, 12312332, 3213123, 345, 999999]
        self.assertEqual(find_max_recursive(arr), max(arr))
        
if __name__ == '__main__':
    unittest.main()