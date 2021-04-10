class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        for((index, value) in nums.withIndex()){
            if (value >= target ){
                return index
            }
        }
        return nums.size
    }
}

val soln = Solution()
println(soln.searchInsert(intArrayOf(1,3,5,6), 5))
println(soln.searchInsert(intArrayOf(1,3,5,6), 2))
println(soln.searchInsert(intArrayOf(1,3,5,6), 7))
println(soln.searchInsert(intArrayOf(1,3,5,6), 0))