class Solution {
    fun repeatedSubstringPattern(s: String): Boolean {
        var isPattern = true
        var prevSum = 0

        for (ch1 in s){
            var curSum = 0
            for (ch2 in s){
                if (ch2.equals(ch1)){
                    curSum++
                }
            }
            if (prevSum == 0){
                prevSum = curSum
            }else{
                println("prevSum: ${prevSum}, curSum: ${curSum}")
                if (prevSum != curSum){
                    isPattern = false
                    break
                }
            }
        }
        return isPattern
    }
}


fun main(){
    val solution = Solution()
//    println(solution.repeatedSubstringPattern("ababab"))
//    println(solution.repeatedSubstringPattern("aba"))
//    println(solution.repeatedSubstringPattern("aaa"))
//    println(solution.repeatedSubstringPattern("a"))
//    println(solution.repeatedSubstringPattern("abdabcab"))
//    println(solution.repeatedSubstringPattern("abcdabcdabcd"))
    println(solution.repeatedSubstringPattern("acaecacaec"))
}

main()