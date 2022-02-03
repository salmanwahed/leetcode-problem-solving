class Solution {
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var max = Int.MIN_VALUE
        for (account in accounts){
            var sum = account.sum()
            if (sum > max){
                max = sum
            }
        }
        return max
    }
}

fun main(){
    val soln = Solution()
    println(soln.maximumWealth(arrayOf(intArrayOf(1, 5), intArrayOf(7, 3), intArrayOf(3, 5))))
}

main()