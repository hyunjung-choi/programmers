package level1

/**
 * 가장 많이 받은 선물
 * https://school.programmers.co.kr/learn/courses/30/lessons/258712
 */

private fun getGiftIndexMap(
    friends: Array<String>,
    givenMap: MutableMap<String, Int>,
    receivedMap: MutableMap<String, Int>
): MutableMap<String, Int> {
    val giftIndexMap = mutableMapOf<String, Int>()

    friends.forEach { friend ->
        giftIndexMap[friend] = (givenMap[friend] ?: 0) - (receivedMap[friend] ?: 0)
    }

    return giftIndexMap
}

private fun solution(friends: Array<String>, gifts: Array<String>): Int {
    // 1. 각 친구의 준 선물과 받은 선물을 기록
    val givenMap = mutableMapOf<String, MutableMap<String, Int>>().apply {
        friends.forEach { this[it] = mutableMapOf() }
    }
    val receivedCount = mutableMapOf<String, Int>().withDefault { 0 }

    // 2. 선물 기록 업데이트
    gifts.forEach { gift ->
        val (giver, receiver) = gift.split(" ")
        givenMap[giver]!![receiver] = givenMap[giver]!!.getOrDefault(receiver, 0) + 1
    }

    // 3. 각 친구의 선물 지수 계산
    val giftIndex = friends.associateWith { friend ->
        givenMap[friend]!!.values.sum() - givenMap.values.sumOf { it.getOrDefault(friend, 0) }
    }

    // 4. 다음 달 선물 교환 규칙 적용
    for (friend1 in friends) {
        for (friend2 in friends) {
            if (friend1 == friend2) continue

            val given1to2 = givenMap[friend1]!!.getOrDefault(friend2, 0)
            val given2to1 = givenMap[friend2]!!.getOrDefault(friend1, 0)

            when {
                given1to2 > given2to1 -> receivedCount[friend2] = receivedCount.getValue(friend2) + 1
                given1to2 < given2to1 -> receivedCount[friend1] = receivedCount.getValue(friend1) + 1
                else -> { // 주고받은 선물이 같거나 없는 경우
                    val index1 = giftIndex.getValue(friend1)
                    val index2 = giftIndex.getValue(friend2)

                    when {
                        index1 > index2 -> receivedCount[friend2] = receivedCount.getValue(friend2) + 1
                        index1 < index2 -> receivedCount[friend1] = receivedCount.getValue(friend1) + 1
                        // index1 == index2 -> 아무 변화 없음
                    }
                }
            }
        }
    }

    // 5. 가장 많은 선물을 받은 사람의 선물 수 반환
    return receivedCount.values.maxOrNull() ?: 0
}

fun main() {
    val friends1 = arrayOf("muzi", "ryan", "frodo", "neo")
    val gifts1 = arrayOf(
        "muzi frodo",
        "muzi frodo",
        "ryan muzi",
        "ryan muzi",
        "ryan muzi",
        "frodo muzi",
        "frodo ryan",
        "neo muzi"
    )
    println(solution(friends1, gifts1)) // Output: 2

    val friends2 = arrayOf("joy", "brad", "alessandro", "conan", "david")
    val gifts2 =
        arrayOf("alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david")
    println(solution(friends2, gifts2)) // Output: 4

    val friends3 = arrayOf("a", "b", "c")
    val gifts3 = arrayOf("a b", "b a", "c a", "a c", "a c", "c a")
    println(solution(friends3, gifts3)) // Output: 0
}