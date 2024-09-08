# Definition for singly-linked list.
from typing import Optional, List


class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def __get_len(self, head: Optional[ListNode]):
        count = 0
        while head:
            count += 1
            head = head.next
        return count

    def splitListToParts(self, head: Optional[ListNode], k: int) -> List[Optional[ListNode]]:
        res = [None] * k
        head_len = self.__get_len(head)
        split_frq = head_len // k

        idx, cnt = 0, 0
        cur_head = head
        while head:
            cnt += 1
            split_itm = split_frq

            if idx < head_len % k:
                split_itm = split_frq + 1

            if cnt == split_itm:
                tmp_head = head.next
                head.next = None
                head = tmp_head

                res[idx] = cur_head
                cur_head = head
                idx += 1
                cnt = 0
            else:
                head = head.next

        return res


