class Solution{
    fun isBadVersion(version: Int): Boolean{
        if (version in 1702766719..2126753390)
            return true
        return false
    }

    fun getMiddle(left:Int, right:Int): Int{
        var addition: Long = left.toLong() + right.toLong()
        var res: Long = addition/2
        return res.toInt()
    }

    fun firstBadVersion(n: Int) : Int {
        var left = 0
        var right = n
        var checkVersion = getMiddle(left, right)
        while (true){
            if (right - left <= 1) break
            if (isBadVersion(checkVersion)){
                right = checkVersion
                print("Right >> left: $left, right: $right || ")
            }else{
                left = checkVersion
                print("Left >> left: $left, right: $right || ")
            }
            checkVersion = getMiddle(left, right)
            println("check version: $checkVersion")
        }
        return right
    }
}

val soln = Solution()
println(soln.firstBadVersion(2126753390))