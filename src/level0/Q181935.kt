package level0

/**
 * 홀짝에 따라 다른 값 반환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181935
 */

private fun isEven(n: Int) = (2..n step 2).sumOf { it * it }

private fun isOdd(n: Int) = (1..n step 2).sum()

private fun solution(n: Int) = if (n % 2 == 0) isEven(n) else isOdd(n)

fun main() {
    println(solution(7)) // 16
    println(solution(10)) // 220
}