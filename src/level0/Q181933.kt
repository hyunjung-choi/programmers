package level0

/**
 * flag에 따라 다른 값 반환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181933
 */

private fun solution(a: Int, b: Int, flag: Boolean) = if (flag) a + b else a - b

fun main() {
    println(solution(-4, 7, true)) // 3
    println(solution(-4, 7, false)) // -11
}