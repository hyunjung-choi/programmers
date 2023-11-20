package level0

/**
 * n 번째 원소까지
 * https://school.programmers.co.kr/learn/courses/30/lessons/181889
 */

private fun solution(num_list: IntArray, n: Int) = num_list.asList().subList(0, n).toIntArray()