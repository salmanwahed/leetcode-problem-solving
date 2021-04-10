import java.math.BigInteger
import kotlin.system.measureNanoTime

class ListNode(var itm: Int){
    var next: ListNode? = null
    override fun toString(): String {
        var st = "ListNode<$itm, "
        var closing = " null>"
        var ln = next
        while (ln != null){
            st = st + "ListNode<${ln.itm}, "
            ln = ln.next
            closing = closing + ">"
        }
        return st + closing
    }
}

class SolutionWithList{
    fun addTwoNumbers(l1: List<Int>, l2: List<Int>): List<Int>{
        var num1 = 0.0
        var num2 = 0.0
        for (i in 0..l1.size-1){
            num1 = num1 + l1[i]* Math.pow(10.0, i.toDouble())
        }
        for (i in 0..l2.size-1){
            num2 = num2 + l2[i]* Math.pow(10.0, i.toDouble())
        }

        return listOf(num1.toInt(), num2.toInt())
    }
}

class Solution{
    fun addTwoNumbers(ln1: ListNode?, ln2: ListNode?): ListNode?{
        var num1 = getNumber(ln1)
        var num2 = getNumber(ln2)
        println("num1: $num1, num2: $num2")
        var result: BigInteger = num1 + num2
        println("Addition: result: $result")
        return makeListNode(result)
    }

    fun getNumber(ln: ListNode?): BigInteger{
        var counter: BigInteger = BigInteger(0.toString())
        var num: BigInteger = BigInteger(0.toString())
        var lnvar = ln
        while (lnvar != null){
            num = num + BigInteger(lnvar.itm.toString()) * bigPow(BigInteger(10.toString()), counter)
            lnvar = lnvar.next
            counter += BigInteger("1")
        }
        return num
    }

    fun pow(base: Int, power: Int): Long{
        if (power != 0){
            return base * pow(base, power - 1)
        }else{
            return 1L
        }
    }

    fun bigPow(base: BigInteger, power: BigInteger): BigInteger{
        var result = BigInteger.ONE
        var copyBase = base
        var copyPower = power
        while (copyPower.signum() > 0) {
            if (copyPower.testBit(0)) result = result.multiply(copyBase)
            copyBase = copyBase.multiply(copyBase)
            copyPower = copyPower.shiftRight(1)
        }
        return result
    }

    fun makeListNode(number: BigInteger): ListNode?{
        var values = mutableListOf<Int>()
        var numberStr:String = number.toString().reversed()
        val iterator = numberStr.iterator()
        for (value in iterator.iterator()){
            values.add(value.toString().toInt())
        }
        var parentNode: ListNode? = null
        var currentNode: ListNode? = null
        for (itm: Int in values){
            if (parentNode == null){
                parentNode = ListNode(itm)
                currentNode = parentNode
            }else{
                var node = ListNode(itm)
                if (currentNode != null){
                    currentNode.next = node
                    currentNode = node
                }
            }
        }
        return parentNode
    }
}

fun main(){
//    val l1 = listOf<Int>(2,3,4)
//    val l2 = listOf<Int>(3,4,5)

    val ln1_1 = ListNode(9)
//    val ln1_2 = ListNode(4)
//    ln1_1.next = ln1_2
//    val ln1_3 = ListNode(3)
//    ln1_2.next = ln1_3

    val ln2_1 = ListNode(1)
    val ln2_2 = ListNode(9)
    ln2_1.next = ln2_2
    val ln2_3 = ListNode(9)
    ln2_2.next = ln2_3
    val ln2_4 = ListNode(9)
    ln2_3.next = ln2_4
    val ln2_5 = ListNode(9)
    ln2_4.next = ln2_5
    val ln2_6 = ListNode(9)
    ln2_5.next = ln2_6
    val ln2_7 = ListNode(9)
    ln2_6.next = ln2_7
    val ln2_8 = ListNode(9)
    ln2_7.next = ln2_8
    val ln2_9 = ListNode(9)
    ln2_8.next = ln2_9
    val ln2_10 = ListNode(9)
    ln2_9.next = ln2_10

    val solution = Solution()
    val result = solution.addTwoNumbers(ln1_1, ln2_1)
    println(result.toString())

////    var n1: BigInteger = BigInteger(9.toString())
//    var n2: BigInteger = BigInteger("33369696966669546545")
////    var result: BigInteger = n1 + n2
////    var bigPow = solution.bigPow(n1, n2)
////    println("bigPow: $bigPow")
//
////    var values = mutableListOf<Int>()
////    var n2str: String = n2.toString();
////    val iterator = (n2str.reversed()).iterator()
////    for (value in iterator.iterator()){
////        values.add(value.toString().toInt())
////    }
////    println(values)

}

main()