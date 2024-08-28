from typing import List


class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        start, hi_alt = 0, -99999
        for itm in gain:
            start = start + itm
            if start > hi_alt:
                hi_alt = start
        if hi_alt < 0:
            return 0
        else:
            return hi_alt

if __name__ == '__main__':
    soln = Solution()
    print(soln.largestAltitude([-4,-3,-2,-1,4,3,2]))