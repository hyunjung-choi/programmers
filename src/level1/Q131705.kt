package level1

/**
 * 삼총사
 * https://school.programmers.co.kr/learn/courses/30/lessons/131705
 */

private fun solution(number: IntArray): Int {
    var answer = 0
    val size = number.size

    for (i in 0 until size - 2) {
        for (j in i + 1 until size - 1) {
            for (k in j + 1 until size) {
                if (number[i] + number[j] + number[k] == 0) {
                    answer++
                }
            }
        }
    }

    return answer
}

fun main() {
    println(solution(intArrayOf(-2, 3, 0, 2, -5))) // 2
    println(solution(intArrayOf(-3, -2, -1, 0, 1, 2, 3))) // 5
    println(solution(intArrayOf(-1, 1, -1, 1))) // 0
}