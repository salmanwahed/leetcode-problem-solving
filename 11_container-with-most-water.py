from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
        left, right, area_max = 0, len(height) - 1, 0

        while left < right:
            min_height = height[left] if height[left] < height[right] else height[right]

            area = min_height * (right - left)

            area_max = area if area_max < area else area_max

            if height[left] <= height[right]:
                left += 1
            else:
                right -= 1

        return area_max

if __name__ == '__main__':
    sol = Solution()
    print(sol.maxArea([1,8,6,2,5,4,8,3,7]))