package level0

/**
 * 문자열 섞기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181942
 */

fun solution(str1: String, str2: String): String {
    val answer: StringBuilder = StringBuilder()
    var index = 0
    repeat(str1.length) {
        answer.append(str1[index])
        answer.append(str2[index])
        index += 1
    }
    return answer.toString()
}

fun main() {
    println(solution("aaaaa", "bbbbb")) // ababababab
}