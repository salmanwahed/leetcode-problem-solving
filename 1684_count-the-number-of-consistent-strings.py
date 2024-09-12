from typing import List


class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        alloweds = set(allowed)
        count = 0
        for s in words:
            rs = set(s) - alloweds
            if not rs:
               count += 1

        return count

if __name__ == '__main__':
    soln = Solution()
    print(soln.countConsistentStrings(allowed="ab", words=["ad","bd","aaab","baa","badab"]))