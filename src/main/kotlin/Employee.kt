class Employee(
    val lastName: String,
    val firstName: String,
    val patronymic: String,
    val position: String,
    val email: String,
    val phone: String,
    val salary: Int?,
    val age: Int
) {
    init {
        require(lastName.isNotBlank()) { "Фамилия не может быть пустой" }
        require(firstName.isNotBlank()) { "Имя не может быть пустым" }
        require(patronymic.isNotBlank()) { "Отчество не может быть пустым" }
        require(position.isNotBlank()) { "Должность не может быть пустой" }
        require(email.isNotBlank()) { "Email не может быть пустым" }
        require(phone.isNotBlank()) { "Телефон не может быть пустым" }
        require(age > 0) { "Возраст должен быть положительным" }
        require(salary == null || salary >= 0) { "Зарплата не может быть отрицательной" }
    }

    constructor(
        lastName: String,
        firstName: String,
        patronymic: String,
        position: String,
        email: String,
        phone: String,
        age: Int
    ) : this(lastName, firstName, patronymic, position, email, phone, null, age)

    fun printBeautifully() {
        val border = "-".repeat(32)
        println(border)
        println("  Фамилия:   $lastName")
        println("  Имя:       $firstName")
        println("  Отчество:  $patronymic")
        println("  Должность: $position")
        println("  Email:     $email")
        println("  Телефон:   $phone")
        println("  Зарплата:  ${salary ?: "не указана"}")
        println("  Возраст:   $age")
        println(border)
    }
}