import java.util.*

fun main() {
    val defaultUser = User("Admin", "Admin@gmail.com", 18, 10)

    val scanner = Scanner(System.`in`)

    println("Введите данные пользователя:")
    print("Имя пользователя: ")
    val username = scanner.nextLine()
    print("Email: ")
    val email = scanner.nextLine()
    print("Возраст: ")
    val age = scanner.nextInt()
    print("Пароль: ")
    val password = scanner.next()

    val userInputUser = User(username, email, age, password = 10)
    try {
        userInputUser.verify(defaultUser)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}