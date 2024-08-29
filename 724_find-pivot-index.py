from typing import List


class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        pre_sum, post_sum = [], []
        pre_sum.append(nums[0])
        post_sum.append(nums[-1])

        for i in range(1, len(nums)):
            pre_sum.append(pre_sum[i - 1] + nums[i])

        for i in range(1, len(nums)):
            post_sum.append(post_sum[i - 1] + nums[len(nums) - 1 - i])

        post_sum.reverse()

        for i in range(len(nums)):
            if pre_sum[i] == post_sum[i]:
                return i
        return -1

if __name__ == '__main__':
    soln = Solution()
    print(soln.pivotIndex([1,7,3,6,5,6]))