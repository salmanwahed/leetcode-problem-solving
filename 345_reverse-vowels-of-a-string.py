class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = "aAeEiIoOuU"
        stk = []
        for ch in s:
            if ch in vowels:
                stk.append(ch)
        new_s = ""
        for ch in s:
            if ch in vowels:
                new_s += stk.pop()
            else:
                new_s += ch
        return new_s

if __name__ == '__main__':
    soln = Solution()
    print(soln.reverseVowels("Salman Wahed"))