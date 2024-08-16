from typing import List


class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        return [list(set(nums1) - set(nums2)), list(set(nums2) - set(nums1))]

if __name__ == '__main__':
    soln = Solution()
    print(soln.findDifference([1,2,3], [2,3,4]))