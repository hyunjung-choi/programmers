package level0

/**
 * 공배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181936
 */

private fun solution(number: Int, n: Int, m: Int) = if (number % n == 0 && number % m == 0) 1 else 0

fun main() {
    println(solution(60, 2, 3)) // 1
    println(solution(55, 10, 5)) // 0
}