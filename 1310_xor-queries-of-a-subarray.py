from typing import List


class Solution:
    def xorQueries(self, arr: List[int], queries: List[List[int]]) -> List[int]:
        prefix_xor = [0] * (len(arr) + 1)
        for i in range(len(arr)):
            prefix_xor[i + 1] = prefix_xor[i] ^ arr[i]
        res = []
        for l,r in queries:
            xor = prefix_xor[r + 1] ^ prefix_xor[l]
            res.append(xor)
        return res

if __name__ == '__main__':
    soln = Solution()
    print(soln.xorQueries([1,3,4,8], [[0,1],[1,2],[0,3],[3,3]]))