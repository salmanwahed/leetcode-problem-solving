from typing import List


class Solution:
    def canPlaceFlowers(self, flowerbed: List[int], n: int) -> bool:
        plot_count = 0
        for i in range(len(flowerbed)):
            if flowerbed[i] == 0:
                left_o = i == 0 or flowerbed[i - 1] == 0
                right_o = i == len(flowerbed) - 1 or flowerbed[i + 1] == 0

                if left_o and right_o:
                    flowerbed[i] = 1
                    plot_count += 1

            if plot_count >= n:
                return True

        return plot_count >= n

if __name__ == '__main__':
    soln = Solution()
    print(soln.canPlaceFlowers([0, 0, 1, 0, 0, 1, 0], 2))