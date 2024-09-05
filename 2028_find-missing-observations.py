from typing import List


class Solution:
    def missingRolls(self, rolls: List[int], mean: int, n: int) -> List[int]:
        sides = list(range(1, 7))
        missing_sum = (len(rolls) + n) * mean - sum(rolls)

        if missing_sum > n * 6 or missing_sum < n * 1:
            return []

        missing_mean = missing_sum // n

        diff = missing_sum - (missing_mean * n)

        if diff == 0:
            return [missing_mean] * n

        return (n - diff) * [missing_mean] + diff * [missing_mean + 1]

if __name__ == '__main__':
    sol = Solution()
    print(sol.missingRolls([1,5,6], 3, 4))