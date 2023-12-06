package level0

/**
 * 문자열 겹쳐쓰기
 * https://school.programmers.co.kr/learn/courses/30/lessons/181943
 */

class Q181943 {
    fun solution(my_string: String, overwrite_string: String, s: Int): String {
        return my_string.replaceRange(s..s + overwrite_string.length - 1, overwrite_string)
    }
}