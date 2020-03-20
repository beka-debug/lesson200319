fibonacci_dict = {}
def fib(n):
    if n in fibonacci_dict:
        return fibonacci_dict[n]
    if n < 0:
        return -1
    elif n == 1:
        value = 1
    elif n == 2:
        value = 2
    else:
        value = fib(n-1) + fib(n-2)
    fibonacci_dict[n] = value
    return value
    
 
 import unittest
 class fibtest(unittest.TestCase)
 
    def testcase1(self):
      self.assertequal(1,fib(1))
    def testcase2(self):
      self.assertequal(2,fib(2))
    def testcase3(self):
      self.assertequal(3,fib(3))
    def testcase4(self):
      self.assertequal(5,fib(4))
    def testcase5(self):
      self.assertequal(21,fib(7))
