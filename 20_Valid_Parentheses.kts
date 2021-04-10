import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        var stack: Stack<Char> = Stack()
        for (ch in s){
            when(ch){
                '(' -> stack.push(ch)
                '{' -> stack.push(ch)
                '[' -> stack.push(ch)
                ')' -> {
                    if (stack.isEmpty()) return false
                    if (stack.pop() != '(')
                        return false
                }
                '}' -> {
                    if (stack.isEmpty()) return false
                    if (stack.pop() != '{') return false
                }
                ']' -> {
                    if (stack.isEmpty()) return false
                    if (stack.pop() != '[') return false
                }
            }
        }
        return stack.isEmpty()
    }
}

val soln = Solution()
val result = soln.isValid("()[]{}")
println("The result is: $result")