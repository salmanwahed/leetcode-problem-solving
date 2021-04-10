import java.util.*
/* Find consecutive pop sequence */
class Solution {

    fun longestValidParentheses(s: String): Int {
        var stack: Stack<Char> = Stack()
        var popCounter = 0
        var maxPop = 0
        for (ch in s){
            when(ch){
                '(' -> {
                    if (popCounter > maxPop){
                        maxPop = popCounter
                    }
                    if (!stack.isEmpty()) popCounter = 0
                    stack.push(ch)
                }
                '{' -> {
                    if (popCounter > maxPop){
                        maxPop = popCounter
                    }
                    if (!stack.empty())popCounter = 0
                    stack.push(ch)
                }
                '[' -> {
                    if (popCounter > maxPop){
                        maxPop = popCounter
                    }
                    if (!stack.isEmpty())popCounter = 0
                    stack.push(ch)
                }
                ')' -> {
                    if (!stack.empty()){
                        if (stack.pop() == '('){
                            popCounter += 2
                        }
                    }
                }
                '}' -> {
                    if (!stack.empty()){
                        if (stack.pop() == '['){
                            popCounter += 2
                        }
                    }
                }
                ']' -> {
                    if (!stack.empty()){
                        if (stack.pop() == '['){
                            popCounter += 2
                        }
                    }
                }
            }
            println("ch: $ch, popCounter: $popCounter, maxPop: $maxPop")
        }
        if (popCounter > maxPop){
            maxPop = popCounter
        }
        return maxPop
    }
}

val soln = Solution()
val result = soln.longestValidParentheses("()((())")
println("The result is: $result")
println()
//val result1 = soln.longestValidParentheses(")()())")
//println("The result1 is: $result1")
//println()
//val result2 = soln.longestValidParentheses("[((){[[()])")
//println("The result2 is: $result2")
//println()
//val result3 = soln.longestValidParentheses("(()")
//println("The result3 is: $result3")
//println()
//val result4 = soln.longestValidParentheses("}{")
//println("The result4 is: $result4")
//println()
//val result5 = soln.longestValidParentheses("(){}}[][]][({})]")
//println("The result5 is: $result5")
//println()