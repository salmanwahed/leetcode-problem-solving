class Solution {
    fun findAnagrams(s: String, p: String): List<Int> {
        val resultList = arrayListOf<Int>()
        for (i in 0..s.length-p.length){
            if (isAnagram(s.substring(i, i+p.length), p)){
                resultList.add(i)
            }
        }
        return resultList
    }

    fun isAnagram(subStr: String, inputStr: String): Boolean {
        val count = Array(26){ 0 }
        for (i in 0 until inputStr.length  ){
            count[subStr[i] - 'a'] += 1
            count[inputStr[i] - 'a'] -= 1
        }
        for (i in 0 until  26){
            if (count[i] != 0){
                return false
            }
        }
        return true
    }
}

fun main(){
    val soln = Solution()
    val result: List<Int> = soln.findAnagrams("abab", "ab")
    println(result.joinToString(", "))
}

main()