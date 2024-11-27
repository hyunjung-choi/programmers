package level0

/**
 * 문자 리스트를 문자열로 변환하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181941
 */

private fun solution(arr: Array<String>) = arr.joinToString()

fun main() {
    println(solution(arrayOf("a", "b", "c"))) // "abc"
}