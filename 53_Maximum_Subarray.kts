class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var max = Int.MIN_VALUE;
        var temp = Int.MIN_VALUE
        for (i in nums.indices){
            temp = nums[i]
            if (temp > max)
                max = temp
            for (j in i+1..nums.size-1){
                temp = temp + nums[j]
                if (temp > max){
                    max = temp
                }
            }
        }
        return max
    }
}

fun main(){
    val solution = Solution()
    println(solution.maxSubArray(intArrayOf(-2,1,-3,4,-1,2,1,-5,4)))
}

main()