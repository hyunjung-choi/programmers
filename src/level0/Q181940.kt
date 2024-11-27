package level0

/**
 * 문자열 곱하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181940
 */

private fun solution(my_string: String, k: Int) = my_string.repeat(k)

fun main() {
    println(solution("string", 3))
    println(solution("love", 10))
}