class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var mergedSize = nums1.size + nums2.size
        var mergedArray: IntArray = IntArray(mergedSize)

        var m = 0; var n = 0
        for (i in 0 until mergedSize){
            if (m >= nums1.size){
                mergedArray[i] = nums2[n++]
            }else if (n >= nums2.size){
                mergedArray[i] = nums1[m++]
            }else{
                if (nums1[m] < nums2[n]){
                    mergedArray[i] = nums1[m++]
                }else{
                    mergedArray[i]= nums2[n++]
                }
            }
        }
        if (mergedSize % 2 == 1){
            var index = mergedSize/2
//            println("index: $index")
            return mergedArray[index].toDouble()
        }else{
            var num1 = mergedArray[(mergedSize/2 - 1)]
            var num2 = mergedArray[(mergedSize/2)]
//            println("num1: $num1, num2: $num2")
            return (num1 + num2)/2.0
        }
    }
}

val soln = Solution()
val result = soln.findMedianSortedArrays(intArrayOf(1,2), intArrayOf(3,4))
println("The result is: $result")