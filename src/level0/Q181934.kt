package level0

/**
 * 조건 문자열
 * https://school.programmers.co.kr/learn/courses/30/lessons/181934
 */

private fun solution(ineq: String, eq: String, n: Int, m: Int): Int {
    val operator = Pair(ineq, eq)

    return when (operator) {
        Pair(">", "=") -> if (n >= m) 1 else 0
        Pair("<", "=") -> if (n <= m) 1 else 0
        Pair(">", "!") -> if (n > m) 1 else 0
        Pair("<", "!") -> if (n < m) 1 else 0
        else -> 0
    }
}

fun main() {
    println(solution("<", "=", 20, 50)) // 1
    println(solution(">", "!", 41, 78)) // 0
}