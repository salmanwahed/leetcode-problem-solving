class Solution {
    fun strStr(haystack: String, needle: String): Int {
        var needlePosition = -1; var tempIndex = 0; var needleIndex = 0; var haystackIndex = 0;
        if (needle.length == 0 ){
            needlePosition = 0
        }
        if (needle.length > haystack.length){
            return needlePosition
        }

        while (haystackIndex < haystack.length){
            if (needleIndex == needle.length){
                break
            }
            if(needle[needleIndex].equals(haystack[haystackIndex])){
//                println("haystackCh: ${haystack[haystackIndex]}, needleCh: ${needle[needleIndex]}, " +
//                        "needleIndex: ${needleIndex}, haystackIndex: ${haystackIndex} needlePostition: ${needlePosition}, tempIndex: ${tempIndex}")

                if(needleIndex == 0) {
                    needlePosition = haystackIndex
                }
                needleIndex++
            }else{
//                println("haystackCh: ${haystack[haystackIndex]}, needleCh: ${needle[needleIndex]}, " +
//                        "needleIndex: ${needleIndex}, haystackIndex: ${haystackIndex} needlePostition: ${needlePosition}, tempIndex: ${tempIndex}")
                needleIndex = 0
                tempIndex = needlePosition
                needlePosition = -1
            }
            if (needleIndex == 0 && tempIndex > -1){
//                println("Rescanning...")
                haystackIndex = tempIndex + 1
            }else{
                haystackIndex++
            }
        }
        if (needleIndex == needle.length)
            return needlePosition
        return -1
    }

}

fun main(){
    val solution = Solution()
    println(solution.strStr("mississipi", "issipi"))
    println(solution.strStr("mississippi", "sippia"))
    println(solution.strStr("abcdefgh", "g"))
    println(solution.strStr("aa", "lam"))
    println(solution.strStr("mirrormirroronthewall", "roro"))
    println(solution.strStr("aaab", "b"))
    println(solution.strStr("", ""))
}

main()