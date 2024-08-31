from typing import List


class Solution:
    def add_remaining(self, stk: List, c: str, al: List):
        if al:
            while al:
                k = al.pop()
                if c == '1':
                    if k == '0':
                        stk.append('1')
                        c = '0'
                    else:
                        stk.append('0')
                        c = '1'
                else:
                    stk.append(k)
        if c == '1':
            stk.append(c)
        return stk

    def addBinary(self, a: str, b: str) -> str:
        carry = 0
        stk = []
        al = list(a)
        bl = list(b)
        c = '0'
        while al and bl:
            x = al.pop()
            y = bl.pop()
            if (x == '1' and y == '0') or (x == '0' and y == '1'):
                if c == '1':
                    stk.append('0')
                    c = '1'
                else:
                    stk.append('1')
            elif x == '1' and y == '1':
                if c == '1':
                    stk.append('1')
                else:
                    stk.append('0')
                c = '1'
            else:
                if c == '1':
                    stk.append('1')
                else:
                    stk.append('0')
                c = '0'

        if al:
            stk = self.add_remaining(stk, c, al)
        else:
            stk = self.add_remaining(stk, c, bl)
        res = ''
        while stk:
            res = res + stk.pop()

        return res


if __name__ == '__main__':
    soln = Solution()
    print(soln.addBinary('1110', '111'))
