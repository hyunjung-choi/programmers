package level0

/**
 * 코드 처리하기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181932
 */

private fun solution(code: String): String {
    var mode = 0
    val sb = StringBuilder()

    for (idx in code.indices) {
        val ch = code[idx]

        if (ch == '1') {
            mode = 1 - mode
        } else {
            if (mode == 0 && idx % 2 == 0) sb.append(ch)
            if (mode == 1 && idx % 2 != 0) sb.append(ch)
        }
    }

    return if (sb.isEmpty()) "EMPTY" else sb.toString()
}

fun main() {
    println(solution("abc1abc1abc"))    // "acbac"
    println(solution("1"))              // EMPTY
}
