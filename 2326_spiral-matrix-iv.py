# Definition for singly-linked list.
from typing import Optional, List


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def spiralMatrix(self, m: int, n: int, head: Optional[ListNode]) -> List[List[int]]:
        matrix = [[-1 for _ in range(n)] for _ in range(m)]
        left, right = 0, n
        top, bottom = 0, m

        while top < bottom and left < right:
            if not head:
                break

            # left to right -> top row (increase top)
            for i in range(left, right):
                matrix[top][i] = head.val
                head = head.next
                if not head:
                    break
            top += 1

            if not head:
                break

            # top to bottom -> right column (reduce right)
            for i in range(top, bottom):
                matrix[i][right - 1] = head.val
                head = head.next
                if not head:
                    break
            right -= 1

            if not head:
                break

            # right to left -> bottom row (reduce bottom)
            if top < bottom:
                for i in range(right - 1, left - 1, -1):
                    matrix[bottom - 1][i] = head.val
                    head = head.next
                    if not head:
                        break
                bottom -= 1

            if not head:
                break

            # bottom to top -> left column (increase left)
            if left < right:
                for i in range(bottom - 1, top - 1, -1):
                    matrix[i][left] = head.val
                    head = head.next
                    if not head:
                        break
                left += 1

        return matrix