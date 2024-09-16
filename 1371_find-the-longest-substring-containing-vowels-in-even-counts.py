class Solution:
    def findTheLongestSubstring(self, s: str) -> int:
        vmap = dict(a=1, e=2, i=4, o=8, u=16)
        cval = [vmap.get(ch, 0) for ch in s]

        prefix_arr = [0 ^ cval[0]]

        for i in range(1, len(s)):
            prefix_arr.append(prefix_arr[i - 1] ^ cval[i])

        max_len = 0
        first_occurrence = {0: -1}

        for i in range(len(prefix_arr)):
            if prefix_arr[i] in first_occurrence:
                max_len = max(max_len, i - first_occurrence[prefix_arr[i]])
            else:
                first_occurrence[prefix_arr[i]] = i

        return max_len

if __name__ == '__main__':
    soln = Solution()
    assert soln.findTheLongestSubstring("eleetminicoworoep") == 13