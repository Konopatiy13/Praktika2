fun main() {
    // 1. Создаем константы age1 и age2
    val age1: Int = 42
    val age2: Int = 21
    println("Тип age1: ${age1::class.simpleName}, тип age2: ${age2::class.simpleName}")

    // 2. Вычисляем среднее и проверяем его тип
    val avg1 = (age1 + age2) / 2   // Здесь будет ошибка, так как результат Int
    println("Среднее avg1: $avg1, тип: ${avg1::class.simpleName}") // Ошибка собирания тип

    // 3. Исправляем типы age1 и age2
    val avg1Fixed = (age1.toDouble() + age2.toDouble()) / 2
    println("Среднее avg1Fixed: $avg1Fixed, тип: ${avg1Fixed::class.simpleName}") // Теперь всё правильно

    // 4. Создаем строковые константы
    val firstName: String = "Константин"
    val lastName: String = "Выгонов"
    println("Имя: $firstName, Фамилия: $lastName")

    // 5. Создаем строковую константу fullName
    val fullName: String = "$firstName $lastName"
    println("Полное имя: $fullName")

    // 6. Создаем строковую константу myDetails
    val myDetails: String = "Привет, меня зовут $fullName."
    println(myDetails)

    // 7. Объявляем константу Triple для даты
    val date: Triple<Int, Int, Int> = Triple(11, 13, 2006) // 10 - месяц, 25 - день, 2023 - год
    println("Дата: ${date.first}/${date.second}/${date.third}")

    // 8. Извлекаем значения из Triple
    val (month, day, year) = date
    println("Месяц: $month, День: $day, Год: $year")

    // 9. Выводим значения месяца и года в две константы
    val (monthOutput, yearOutput) = Pair(month, year)
    println("Месяц: $monthOutput, Год: $yearOutput")

    // 10. Изменяем значение месяца и создаем новую Pair
    val newMonth = month + 1 // Например, изменим месяц на 1 больше
    val newDatePair = Pair(newMonth, year) // Создаем новую Pair с измененным месяцем и ненужным годом
    println("Измененная пара: Месяц: ${newDatePair.first}, Год: ${newDatePair.second}")
}