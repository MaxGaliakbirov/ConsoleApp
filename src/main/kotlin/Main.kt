

fun main(args: Array<String>) {
    println("Для начала работы введите комманду /start.")

    val input = readLine()?.split(" ")?.toTypedArray()
    val command = input?.get(0)
    val carColor = input?.get(1)
    val carBrand = input?.get(2)
    val carNumber = input?.get(3)
    val firstName = input?.get(4)
    val lastName = input?.get(5)


}