package level2

/**
 * 귤 고르기
 * https://school.programmers.co.kr/learn/courses/30/lessons/138476
 */

private fun solution(k: Int, tangerine: IntArray): Int {
    var answer = 0
    var container = 0
    val map = mutableMapOf<Int, Int>()

    for (t in tangerine) {
        map[t] = map.getOrDefault(t, 0) + 1
    }

    val list = map.values.toMutableList().sortedDescending()

    for (t in list) {
        if (t > k) return 1
        if (container >= k) return answer

        container += t
        answer++
    }

    return answer
}

fun main() {
    println(solution(6, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3))) // 3
    println(solution(4, intArrayOf(1, 3, 2, 5, 4, 5, 2, 3))) // 2
    println(solution(2, intArrayOf(1, 1, 1, 1, 2, 2, 2, 3))) // 1
    println(solution(4, intArrayOf(1, 2, 2, 3, 3, 3))) // 2
}