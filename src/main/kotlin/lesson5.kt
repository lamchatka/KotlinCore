fun main() {

    // Condition operators if/else/when. readline()

    val userAge = readln().toInt()

//    if (userAge >= AGE_OF_MAJORITY) {
//        println("Показать экран со скрытым контентом")
//
//    }
//    if (userAge < AGE_OF_MAJORITY) {
//        println("Вернуться на главный экран приложения")
//    }

    // Else operator
//    if (userAge >= AGE_OF_MAJORITY) {
//        println("Показать экран со скрытым контентом")
//
//    } else {
//        println("Вернуться на главный экран приложения")
//    }


    // else if construction

    //  Если блок содержит одну строчку кода, то фигурные скобки можно убрать
    // Также написать условие + тело в одну строчку

//    if (userAge >= AGE_OF_MAJORITY) {
//        println("Показать экран со скрытым контентом")
//
//    } else if (userAge == 16 || userAge == 17) {
//        println("Показать экран с ограниченным контентом")
//    } else {
//        println("Вернуться на главный экран приложения")
//    }

    // Return value if else
    val resultText = if (userAge >= AGE_OF_MAJORITY) {
       "Показать экран со скрытым контентом"

    } else if (userAge == 16 || userAge == 17) {
       "Показать экран с ограниченным контентом"
    } else {
        "Вернуться на главный экран приложения"
    }

    println(resultText)

    // When operator
    when(userAge) {
        10 -> println("Ввели число 10")
        20 -> println("Ввели число 20")
        42 -> println("Ввели число 42")
        else -> println("Введено другое число")
    }

    // Return value
    val consoleNumber = when(userAge) {
        10 -> "Ввели число 10"
        20 ->"Ввели число 20"
        42 -> "Ввели число 42"
        else -> "Введено другое число"
    }

    println(consoleNumber)

    // Формы написания многострочных конструкций

    val consoleNumber2 = when(userAge) {
        10 -> {
            println("Дополнительное действие, если ввели 10")
            "Ввели число 10"
        }
        20 -> "Ввели число 20"
        42 -> "Ввели число 42"
        else -> "Введено другое число"
    }

    println(consoleNumber2)


}

const val AGE_OF_MAJORITY = 18
const val RETIREMENT_AGE = 65