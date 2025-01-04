package level1

/**
 * 자릿수 더하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/12931
 */

private fun solution(n: Int) = n.toString().map { it.digitToInt() }.sum()

fun main() {
    println(solution(123)) // 6
    println(solution(987)) // 24
}