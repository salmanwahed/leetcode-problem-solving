from typing import List


class Solution:
    def construct2DArray(self, original: List[int], m: int, n: int) -> List[List[int]]:
        res = []

        if len(original) != m * n:
            return res

        row, col = m, 0
        while row:
            onerow = original[col:col + n]
            if onerow:
                res.append(onerow)
                col = col + n
            row -= 1

        return res

if __name__ == '__main__':
    soln = Solution()
    print(soln.construct2DArray(original=[-1, 2, 4, 6, 4, 7], m=2, n=3))