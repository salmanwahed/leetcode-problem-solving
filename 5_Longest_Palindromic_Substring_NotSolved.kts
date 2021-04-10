import java.util.*

class Solution {
    fun longestPalindrome(s: String): String {
        var visitedQ: Queue<Char> = LinkedList<Char>()
        var maxSize = 0
        var maxPalindrome = ""
        for (ch in s){
            if (ch in visitedQ) {
                while (true) {
                    var flag = visitedQ.remove()
                    if (flag == ch)
                        break
                }
            }
            visitedQ.add(ch)
            var palindrome: String = checkPalindrome(visitedQ)
            println("ch: $ch, palindrome: ${palindrome}")
            if (palindrome.length > maxSize) {
                maxSize = palindrome.length
                maxPalindrome = palindrome
            }
        }
        return maxPalindrome
    }

    fun checkPalindrome(chrList: Queue<Char>): String{
        var st = ""
        for (ch in chrList){
            st = st + ch.toString()
        }
        if (st == st.reversed())
            return st
        return st
    }
}

val soln = Solution()
val result = soln.longestPalindrome("babad")
println("babad : $result")
val result1 = soln.longestPalindrome("abcabcbb")
println("abcabcbb: $result1")
val result2 = soln.longestPalindrome("cbbd")
println("cbbd: $result2")