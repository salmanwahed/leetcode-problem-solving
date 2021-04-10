class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var currentIndex = 0
        for (i in 0 until nums.size){
            if (nums[i] != `val`){
                nums[currentIndex] = nums[i]
                currentIndex += 1
            }
        }
        return currentIndex
    }
}

val nums: IntArray = intArrayOf(0,1,2,2,3,0,4,2)
val soln = Solution()
val result = soln.removeElement(nums, 2)
println("Unique numbers: $result")
for (num in nums){
    print("$num ")
}