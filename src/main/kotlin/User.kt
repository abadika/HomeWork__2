data class User(
    val username: String,
    val email: String,
    val age: Int,
    val password: Int
) : Verifiable {

    override fun verify(user: User) {
        if (this == user) {
            println("Вход выполнен успешно!")
        } else {
            throw IllegalArgumentException("Неверные данные для входа")
        }
    }
}