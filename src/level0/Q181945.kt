package level0

/**
 * 문자열 돌리기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181945
 */

fun main(args: Array<String>) {
    readLine()!!.split("").filter { it.isNotBlank() }.map { println(it) }
}