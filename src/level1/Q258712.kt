package level1

/**
 * 가장 많이 받은 선물
 * https://school.programmers.co.kr/learn/courses/30/lessons/258712
 */

private fun solution(friends: Array<String>, gifts: Array<String>): Int {
    val givenMap = mutableMapOf<String, MutableMap<String, Int>>().apply {
        friends.forEach { this[it] = mutableMapOf() }
    }
    val receivedMap = mutableMapOf<String, Int>()

    gifts.forEach { gift ->
        val (giver, receiver) = gift.split(" ")
        givenMap[giver]!![receiver] = givenMap[giver]!!.getOrDefault(receiver, 0) + 1
    }

    val giftIndex = friends.associateWith { friend ->
        givenMap[friend]!!.values.sum() - givenMap.values.sumOf { it.getOrDefault(friend, 0) }
    }

    for (i in friends.indices) {
        for (j in i + 1 until friends.size) {
            val friend1 = friends[i]
            val friend2 = friends[j]

            val given1to2 = givenMap[friend1]!!.getOrDefault(friend2, 0)
            val given2to1 = givenMap[friend2]!!.getOrDefault(friend1, 0)

            when {
                given1to2 > given2to1 -> receivedMap[friend1] = receivedMap.getOrDefault(friend1, 0) + 1
                given2to1 > given1to2 -> receivedMap[friend2] = receivedMap.getOrDefault(friend2, 0) + 1

                else -> {
                    val index1 = giftIndex.getValue(friend1)
                    val index2 = giftIndex.getValue(friend2)

                    when {
                        index1 > index2 -> receivedMap[friend1] = receivedMap.getOrDefault(friend1, 0) + 1
                        index1 < index2 -> receivedMap[friend2] = receivedMap.getOrDefault(friend2, 0) + 1
                    }
                }
            }
        }
    }

    return receivedMap.values.maxOrNull() ?: 0
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