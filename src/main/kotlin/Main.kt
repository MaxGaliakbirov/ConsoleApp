
fun main(args: Array<String>) {
    println("Для начала работы введите комманду /start.")
    val userInput = readLine()?.split(" ")?.toTypedArray()
    println(userInput.contentToString())
    val command = userInput?.get(0)
    val carColor = userInput?.get(1)
    val carBrand = userInput?.get(2)
    val carNumber = userInput?.get(3)
    val firstName = userInput?.get(4)
    val lastName = userInput?.get(5)
    println(carNumber)

}
