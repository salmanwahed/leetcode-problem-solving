from typing import List


class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        d, r = {}, []
        for s in s1.split() + s2.split():
            if s in d:
                d[s] = d[s] + 1
            else:
                d[s] = 1

        for s in d:
            if d[s] == 1:
                r.append(s)

        return r

if __name__ == '__main__':
    soln = Solution()
    assert soln.uncommonFromSentences("apple apple", "banana") == ["banana"]