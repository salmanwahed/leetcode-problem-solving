class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var current_index = 1
        for (i in 1 until nums.size){
            if (nums[i] != nums[i-1]){
                nums[current_index] = nums[i]
                current_index += 1
            }
        }
        return current_index
    }
}

val nums: IntArray = intArrayOf(0,0,1,2,3,4,5,6,7,8,8,8,9,9,10,11,11,12)
val soln = Solution()
val result = soln.removeDuplicates(nums)
println("Unique numbers: $result")
for (num in nums){
    print("$num ")
}
