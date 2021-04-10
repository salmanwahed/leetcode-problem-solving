class Solution {
    fun countAndSay(n: Int): String {
        var countList: ArrayList<String> = arrayListOf("", "1")
        var startString = "1"
        for (i in 1..30){
            startString = getNextString(startString)
            countList.add(startString)
        }
        return countList.get(n)
    }

    fun getNextString(str: String): String{
        var currentStr: Char? = null
        var count = 0
        var nextStr = ""
        for (chr in str.iterator()){
            if (currentStr == null){
                currentStr = chr
            }
            if (chr == currentStr){
                count += 1
            }else{
                nextStr = nextStr + count.toString() + currentStr.toString()
                currentStr = chr
                count = 1
            }
        }
        nextStr = nextStr + count.toString() + currentStr.toString()
        return nextStr
    }
}

val soln = Solution()
val result = soln.countAndSay(5)
val result1 = soln.countAndSay(1)
val result2 = soln.countAndSay(2)
val result3 = soln.countAndSay(3)
val result4 = soln.countAndSay(4)

println("The result is: $result")
println("The result1 is: $result1")
println("The result2 is: $result2")
println("The result3 is: $result3")
println("The result4 is: $result4")
