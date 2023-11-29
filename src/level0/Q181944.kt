package level0

/**
 * 홀짝 구분하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181944
 */

fun main(args: Array<String>) {
    val a = readLine()!!.toInt()
    if (a % 2 == 0) println("$a is even") else println("$a is odd")
}