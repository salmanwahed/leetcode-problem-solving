class Solution:
    def __init__(self):
        self.vowels = {'a', 'e', 'i', 'o', 'u'}

    def __count_vowel(self, st):
        count = 0
        for ch in st:
            if ch in self.vowels:
                count += 1
        return count

    def maxVowels(self, s: str, k: int) -> int:
        left, right = 0, k
        vc = max_vc = self.__count_vowel(s[left:right])

        while right < len(s):
            if s[left] in self.vowels:
                vc -= 1
            if s[right] in self.vowels:
                vc += 1
            max_vc = max(max_vc, vc)
            left += 1
            right += 1

        return max_vc


if __name__ == '__main__':
    sol = Solution()
    print(sol.maxVowels("abciiidef", 3))