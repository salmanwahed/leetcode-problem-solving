class Solution:
    def getLucky(self, s: str, k: int) -> int:
        ds = ''
        for ch in s:
            ds += str(ord(ch) - 96)
        while k:
            sd = str(sum([int(ch) for ch in ds]))
            ds = sd
            k -= 1
        return int(sd)

if __name__ == '__main__':
    sol = Solution()
    print(sol.getLucky('leetcode', 2))