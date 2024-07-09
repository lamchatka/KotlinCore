fun main() {

    // 4. Comparison (relation) operators, logical operators

    // Операторы сравнения - <, >, >=, <=, ==, !=
    println(0 < -1) // false
    println(1 == 1) // true
    println(2 == 3) // false
    println(7 != 8) // true

    // Операторы сравнения ссылочного типа - ===, !==


    val userAge = 15
    val comparisonResult: Boolean
//    comparisonResult = userAge >= AGE_OF_MAJORITY
//    println("Результат проверки возраста пользователя: $comparisonResult")

    // Логический оператор «и» (&&, and) and «или» (||, or)
//    comparisonResult = userAge >= AGE_OF_MAJORITY && userAge <= RETIREMENT_AGE
//    println("Результат проверки возраста пользователя: $comparisonResult")
    /*
    При использовании and вместо && или or вместо ||
    необходимо заключать операции отношения в круглые скобки
    (это связано с приоритетом выполнения операций).
     */

    // Текущее выражение сравнения – это ничто иное, как диапазон допустимых чисел между 18 и 65.
//    comparisonResult = userAge in AGE_OF_MAJORITY..RETIREMENT_AGE
//    println("Результат проверки возраста пользователя: $comparisonResult")

    // Логический оператор отрицания (!)
    val a = true
    val b = !a
    println(b) // false



}

//const val AGE_OF_MAJORITY = 18
//const val RETIREMENT_AGE = 65

/*
const значения известны на этапе компиляции и эти переменные пропадают в скомпилированном коде,
оставив в месте их применения только значения.
а просто val переменные остаются в скомпилированном коде
и их значение неизвестно до выполнения кода программы.
У них есть getter, который используется, чтобы получить значение, хранимое внутри.
Использование const благоприятно влияет на производительность и в целом считается хорошим тоном для объявления постоянных переменных
 */