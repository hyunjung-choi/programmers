package level0

import kotlin.math.max

/**
 * 두 수의 연산값 비교하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181938
 */

private fun solution(a: Int, b: Int) = max("$a$b".toInt(), 2 * a * b)

fun main() {
    println(solution(2, 91)) // 364
    println(solution(91, 2)) // 912
}