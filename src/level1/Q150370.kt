package level1

/**
 * 개인정보 수집 유효기간
 */

class Q150370 {
    private fun dateToDays(year: Int, month: Int, day: Int): Int {
        return year * 12 * 28 + month * 28 + day
    }

    private fun parseDate(date: String): Triple<Int, Int, Int> {
        val parts = date.split(".")
        return Triple(parts[0].toInt(), parts[1].toInt(), parts[2].toInt())
    }

    fun solution(today: String, terms: Array<String>, privacies: Array<String>): IntArray {
        val (todayYear, todayMonth, todayDay) = parseDate(today)
        val todayInDays = dateToDays(todayYear, todayMonth, todayDay)

        val termMap = mutableMapOf<String, Int>()
        for (term in terms) {
            val (type, period) = term.split(" ")
            termMap[type] = period.toInt()
        }

        val answer = mutableListOf<Int>()

        for ((index, privacy) in privacies.withIndex()) {
            val (date, type) = privacy.split(" ")
            val (year, month, day) = parseDate(date)

            val termPeriod = termMap[type]!!
            val expirationYear = year + (month + termPeriod - 1) / 12
            val expirationMonth = (month + termPeriod - 1) % 12 + 1
            val expirationDay = day - 1

            val expirationInDays = dateToDays(expirationYear, expirationMonth, expirationDay)

            if (expirationInDays < todayInDays) {
                answer.add(index + 1)
            }
        }

        return answer.toIntArray()
    }
}