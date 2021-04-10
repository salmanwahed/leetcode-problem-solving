class Solution{
    fun reverse(x: Int): Int {
        var values = arrayListOf<Int>()
        var num: Long = 0L
        var copyX = x
        while (true){
            values.add(copyX % 10)
            if (copyX / 10 == 0 ){
                break
            }
            copyX = copyX / 10
        }
        for ((index, value) in values.reversed().withIndex()){
            num = num + pow(10, index) * value
        }
        if (num > Integer.MAX_VALUE || num< Integer.MIN_VALUE){
            return 0
        }
        return num.toInt()
    }

    fun pow(base: Int, exponent: Int): Long{
        if (exponent == 0){
            return 1L
        }else{
            return base * pow(base, exponent - 1)
        }
    }
}

val solution = Solution()
val x = 1534236469
val reversedNum = solution.reverse(x)
println("\nx:$x reversed number: $reversedNum")

