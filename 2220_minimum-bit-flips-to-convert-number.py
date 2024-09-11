class Solution:
    def minBitFlips(self, start: int, goal: int) -> int:
        xor = "{0:b}".format(start ^ goal)
        return xor.count('1')

if __name__ == '__main__':
    sol = Solution()
    print(sol.minBitFlips(7 , 10))