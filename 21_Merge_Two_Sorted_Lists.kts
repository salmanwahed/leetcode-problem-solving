/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int){
    var next: ListNode? = null
    override fun toString(): String {
        var st = "ListNode<$`val`, "
        var closing = " null>"
        var ln = next
        while (ln != null){
            st = st + "ListNode<${ln.`val`}, "
            ln = ln.next
            closing = closing + ">"
        }
        return st + closing
    }
}
class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var listNode1 = l1; var listNode2 = l2
        var parentNode: ListNode? = null
        var currentNode: ListNode? = null
        while (listNode1 != null || listNode2 != null){
            if (listNode1 != null && listNode2 != null){
                if (listNode1.`val` <= listNode2.`val`){
                    if (parentNode == null){
                        parentNode = ListNode(listNode1.`val`)
                        currentNode = parentNode
                    }else{
                        var node = ListNode(listNode1.`val`)
                        if (currentNode != null){
                            currentNode.next = node
                            currentNode = node
                        }
                    }
                    listNode1 = listNode1.next
                }else {
                    if (parentNode == null){
                        parentNode = ListNode(listNode2.`val`)
                        currentNode = parentNode
                    }else{
                        var node = ListNode(listNode2.`val`)
                        if (currentNode != null){
                            currentNode.next = node
                            currentNode = node
                        }
                    }
                    listNode2 = listNode2.next
                }
            }else if (listNode1 == null && listNode2 != null){
                if (parentNode == null){
                    parentNode = ListNode(listNode2.`val`)
                    currentNode = parentNode
                }else{
                    var node = ListNode(listNode2.`val`)
                    if (currentNode != null){
                        currentNode.next = node
                        currentNode = node
                    }
                }
                listNode2 = listNode2.next
            }else if (listNode2 == null && listNode1 != null){
                if (parentNode == null){
                    parentNode = ListNode(listNode1.`val`)
                    currentNode = parentNode
                }else{
                    var node = ListNode(listNode1.`val`)
                    if (currentNode != null){
                        currentNode.next = node
                        currentNode = node
                    }
                }
                listNode1 = listNode1.next
            }
        }
        return parentNode;
    }

}

val ln1_1 = ListNode(1)
val ln1_2 = ListNode(3)
ln1_1.next = ln1_2
//val ln1_3 = ListNode(5)
//ln1_2.next = ln1_3

val ln2_1 = ListNode(1)
val ln2_2 = ListNode(2)
ln2_1.next = ln2_2
val ln2_3 = ListNode(4)
ln2_2.next = ln2_3

val solution = Solution()
val result = solution.mergeTwoLists(ln1_1, ln2_1)
println(result.toString())