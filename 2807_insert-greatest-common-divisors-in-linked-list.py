# Definition for singly-linked list.
from typing import Optional


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def __gcd(self, a, b):
        if a == 0:
            return b
        return self.__gcd(b % a, a)

    def insertGreatestCommonDivisors(self, head: Optional[ListNode]) -> Optional[ListNode]:
        cur = head
        while cur:
            nxt = cur.next
            if not nxt:
                return head

            gcd = self.__gcd(cur.val, nxt.val)
            node = ListNode(val=gcd, next=nxt)
            cur.next = node
            cur = nxt
        return head
