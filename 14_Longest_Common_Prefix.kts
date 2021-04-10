
class Solution {
            fun longestCommonPrefix(strs: Array<String>): String {
                if (strs.size == 0) return "";
                val minLen = getMinLength(strs)
                if (minLen == 0) return ""
                for (i in 0 until minLen){
                    var chr = strs[0][i]
                    for (j in 1 until strs.size){
                        if (strs[j][i] != chr){
                            return strs[0].substring(0, i);
                        }
                    }
                }
                return strs[0].substring(0, minLen)
            }

            fun getMinLength(strs: Array<String>): Int{
                var minLen: Int = Int.MAX_VALUE
        for (st in strs){
            if (st.length < minLen){
                minLen = st.length
            }
        }
        return minLen
    }
}

val strs: Array<String> = arrayOf("a", "")
val soln = Solution()
val result = soln.longestCommonPrefix(strs)
println("The result is: $result")