class Solution:
    def twoSum(self, nums, target):
        for i, num in enumerate(nums):
            compliment = target - num
            try:
                j = nums.index(compliment)
                if i != j:
                    return [i, j]
            except ValueError:
                continue
