fun main() {
    while (true) {
        val amount = readln()
        val commissionPercent: Double = 0.75
        val commission: Int = (amount.toDouble() / 100.00 * commissionPercent).toInt()
        var result = if (amount.toInt() in 35..150000) "Коммиссия: $commission Рублей" else "Error"
        println(result)
    }
}