import java.util.*

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length){
            return false
        }else{
            return  Arrays.equals(s.toCharArray(), t.toCharArray())
        }
    }
}

val soln = Solution()
val result = soln.isAnagram("anagram", "amagran")
println("The result is: $result")