package level0

/**
 * 대소문자 바꿔서 출력하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181949
 */

fun main(args: Array<String>) {
    val s1 = readLine()!!
    val array = s1.toCharArray()
    for (char in array) {
        if (Character.isUpperCase(char)) print(char.lowercase())
        else print(char.uppercase())
    }
}