from typing import List


class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        i, pos = 0, 0

        while i < len(nums) and pos < len(nums):
            if nums[i] != 0:
                nums[i], nums[pos] = nums[pos], nums[i]
                pos += 1
                i += 1
            else:
                i += 1

        return nums


if __name__ == '__main__':
    soln = Solution()
    print(soln.moveZeroes([0, 1, 0, 0, 2, 3, 0, 0, 7, 0, 0]))
