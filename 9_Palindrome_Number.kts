class Solution {
    fun isPalindrome(x: Int): Boolean {
        var st = x.toString()
        if (st == st.reversed()){
            return true
        }
        return false
    }
}

val soln = Solution()
val testX = 12321
println("$testX palindrome: ${soln.isPalindrome(testX)}")