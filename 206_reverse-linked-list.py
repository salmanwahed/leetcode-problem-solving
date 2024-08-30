from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        stk = []

        while head:
            stk.append(head.val)
            head = head.next

        if stk:
            head = ListNode(val=stk.pop())
            node = head
            while stk:
                node.next = ListNode(val=stk.pop())
                node = node.next

        return head
