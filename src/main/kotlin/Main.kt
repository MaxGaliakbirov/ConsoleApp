
//val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>) {
    println("Для начала работы введите комманду /start.")

    while (true) {
        val startCommand = readLine()
        when (startCommand) {
            "/start" -> println("Добро пожаловать!")
            "/help" -> println("Список команд: \n /start - начало работы программы.\n /end - завершение программы")
            "/end" -> {
                println("Всего доброго!")
                break
            }
            else -> println("Вы ввели не корректную команду.  введите /help для вывода доступных комманд")
        }
    }
}