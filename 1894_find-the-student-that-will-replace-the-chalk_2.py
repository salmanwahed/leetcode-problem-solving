from typing import List


class Solution:
    def chalkReplacer(self, chalk: List[int], k: int) -> int:
        sum_chalk = sum(chalk)
        k = k % sum_chalk

        psum, arr = 0, []
        for i in chalk:
            psum = psum + i
            arr.append(psum)

        return self.__binary_search(arr, k)

    def __binary_search(self, arr, k):
        lo, hi = 0, len(arr) - 1
        while lo < hi:
            mid = (lo + hi) // 2

            if arr[mid] <= k:
                lo = mid + 1
            else:
                hi = mid
        return hi

if __name__ == '__main__':
    soln = Solution()
    print(soln.chalkReplacer([3,4,1,2], 25))