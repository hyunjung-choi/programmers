package level0

/**
 * n의 배수
 * https://school.programmers.co.kr/learn/courses/30/lessons/181937
 */

private fun solution(num: Int, n: Int) = if (num % n == 0) 1 else 0

fun main() {
    println(solution(98, 2)) // 1
    println(solution(34, 3)) // 0
}