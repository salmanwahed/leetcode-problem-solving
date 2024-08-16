from typing import List


class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        result = []
        unique_dict = {itm: 1 for itm in nums1}
        for itm in nums2:
            if unique_dict.get(itm):
                unique_dict[itm] = unique_dict[itm] + 1

        print(unique_dict)
        for key, val in unique_dict.items():
            if val > 1:
                result.append(key)
        return result


if __name__ == '__main__':
    soln = Solution()
    print(soln.intersection([1,2,2,1], [2,2]))
