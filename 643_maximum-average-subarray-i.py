from typing import List


class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:
        max_sum = sum(nums[0:k])
        tmp_sum = max_sum
        i, j = 0, k - 1
        while j < len(nums) - 1:
            tmp_sum = tmp_sum - nums[i] + nums[j + 1]
            if tmp_sum > max_sum:
                max_sum = tmp_sum
            j += 1
            i += 1

        return max_sum / k

if __name__ == '__main__':
    soln = Solution()
    print(soln.findMaxAverage([1,12,-5,-6,50,3], 4))