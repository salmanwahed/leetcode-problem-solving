class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var targetList = arrayListOf<Int>()
        for((index, value) in nums.withIndex()){
            if (target == value){
                targetList.add(index)
            }
        }
        when(targetList.size){
            0 -> return intArrayOf(-1, -1)
            1 -> return intArrayOf(targetList.get(0), targetList.get(0))
            2 -> return intArrayOf(targetList.get(0), targetList.get(1))
            else -> return intArrayOf(targetList.get(0), targetList.get(targetList.size -1))
        }
    }
}

val soln = Solution()
val res = soln.searchRange(intArrayOf(5,7,7,8,8,8,8,10), 10)
for (itm in res){
    print("$itm ")
}