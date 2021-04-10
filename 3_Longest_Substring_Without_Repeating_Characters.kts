import java.util.*
import kotlin.collections.ArrayDeque
import kotlin.collections.ArrayList

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var visitedQ: Queue<Char> = LinkedList<Char>()
        var maxSize = 0
        for (ch in s){
            if (ch in visitedQ) {
                while (true) {
                    var flag = visitedQ.poll()
                    if (flag == ch)
                        break
                }
            }
            visitedQ.add(ch)
            println("Ch: $ch, Visited: ${printList(visitedQ)}")
            if (visitedQ.size > maxSize)
                maxSize = visitedQ.size
        }
        return maxSize
    }
    fun printList(chrList: Queue<Char>): String{
        var st = ""
        for (ch in chrList){
            st = st + ch.toString() + " "
        }
        return st
    }
}


val soln = Solution()
val result = soln.lengthOfLongestSubstring("anviaj")
println("anviaj : $result")
val result1 = soln.lengthOfLongestSubstring("abcabcbb")
println("abcabcbb: $result1")
val result2 = soln.lengthOfLongestSubstring("bbbbb")
println("bbbbb: $result2")
val result3 = soln.lengthOfLongestSubstring("aab")
println("aab: $result3")
val result4 = soln.lengthOfLongestSubstring("pwwkew")
println("pwwkew: $result4")
val result5 = soln.lengthOfLongestSubstring("dvdf")
println("dvdf : $result5")
val result6 = soln.lengthOfLongestSubstring("ckilbkd")
println("ckilbkd : $result6")