from typing import List


class Solution:
    def chalkReplacer(self, chalk: List[int], k: int) -> int:
        sum_chalk = sum(chalk)
        k = k % sum_chalk

        psum = 0
        for i in range(len(chalk)):
            psum = psum + chalk[i]
            if psum > k:
                return i

if __name__ == '__main__':
    soln = Solution()
    print(soln.chalkReplacer([3,4,1,2], 25))