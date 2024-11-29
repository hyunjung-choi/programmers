package level0

/**
 * 더 크게 합치기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181939
 */

private fun solution(a: Int, b: Int) = "$a$b".toInt().coerceAtLeast("$b$a".toInt())

fun main() {
    println(solution(9, 91)) // 991
    println(solution(89, 8)) // 898
}