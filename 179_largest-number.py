from typing import List


class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        ns = list(map(str, nums))
        ns.sort(key=lambda x: x * 10, reverse=True)
        if ns[0] == '0':
            return '0'
        return ''.join(ns)

if __name__ == '__main__':
    soln = Solution()
    assert soln.largestNumber([3,30,34,5,9]) == "9534330"