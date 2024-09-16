from typing import List


class Solution:
    def __get_minute(self, time_str):
        h, m = map(int, time_str.split(':'))

        minute = h * 60 + m

        if minute == 0:
            return 24 * 60

        return minute

    def findMinDifference(self, timePoints: List[str]) -> int:
        minutes = [self.__get_minute(time_str) for time_str in timePoints]
        minutes.sort()

        min_diff = 24 * 60
        for i in range(1, len(minutes)):
            diff = minutes[i] - minutes[i - 1]
            if diff < min_diff:
                min_diff = diff

        min_diff = min(min_diff, (minutes[0] + 24 * 60 - minutes[-1]))

        return min_diff

if __name__ == '__main__':
    soln = Solution()
    assert (soln.findMinDifference(["05:31","22:08","00:35"])) == 147