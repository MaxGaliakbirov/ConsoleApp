
val scan = java.util.Scanner(System.`in`)
fun main(args: Array<String>) {
    val startCommand = scan.next()
    if (startCommand != "/start" || startCommand != "/help") {
        println("Вы ввели не корректную комманду, наберите /help  для вывода списка комманд")
        scan.next()
    }
    else if (startCommand == "/start") {
        println("Добро пожаловать!")
        scan.next()
    }
    else if (startCommand == "/help") {
        println("Список команд...")
        scan.next()
    } else if (startCommand == "/end") {
        println("Всего доброго!")
    }
}
