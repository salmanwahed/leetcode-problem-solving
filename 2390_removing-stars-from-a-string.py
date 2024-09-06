class Solution:
    def removeStars(self, s: str) -> str:
        stk = []
        for ch in s:
            if ch == '*':
                if stk:
                    stk.pop()
            else:
                stk.append(ch)

        return ''.join(stk)

if __name__ == '__main__':
    sol = Solution()
    print(sol.removeStars("leet**cod*e"))