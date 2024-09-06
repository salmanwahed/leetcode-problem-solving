from typing import List, Optional

# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def modifiedList(self, nums: List[int], head: Optional[ListNode]) -> Optional[ListNode]:
        st = set(nums)
        prev, node = None, head

        while node.next:
            if node.val in st:
                if prev:
                    node = node.next
                    prev.next = node
                else:
                    node = node.next
                    head = node
            else:
                prev = node
                node = node.next

        if node.val in st:
            prev.next = None

        return head

