from typing import List


class Solution:
    def longestSubarray(self, nums: List[int]) -> int:
        max_num = max(nums)
        max_con = 1
        cur_con = 0
        for i in range(len(nums)):
            if nums[i] == max_num:
                cur_con += 1
                if cur_con > max_con:
                    max_con = cur_con
            else:
                cur_con = 0
        return max_con

if __name__ == '__main__':
    soln = Solution()
    print(soln.longestSubarray([1,2,3,3,2,2]))