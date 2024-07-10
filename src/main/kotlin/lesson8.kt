fun main() {

    // 8. Arrays

    // Создание массивов разных типов

    val ingredient1 = "яйцо"
    val ingredient2 = "помидор"
    val ingredient3 = "зелень"
    val ingredient4 = "соль"
    val ingredient5 = "перец"

    // Принципы создания массивов
    // Функция arrayOf()

    val arrayOfIngredients = arrayOf("яйцо", "помидор", "зелень", "соль", "перец") // Array<String> сам определил тип
    val arrayOfIngredients2: Array<String> = arrayOf("яйцо", "помидор", "зелень", "соль", "перец") // Указываем тип для наглядности

    val intArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val charArray: Array<Char> = arrayOf('1', '2', '3')

    //  Но такие массивы можно объявить еще с помощью типов: IntArray или CharArray. Создаются они с похожей функцией intArrayOf() или charArrayOf():
    val intArray1: IntArray = intArrayOf(1, 2, 3, 4, 5)
    val charArray1: CharArray = charArrayOf('1', '2', '3')

    // Нюансы инициализации
//    val intArray2 = arrayOf() // ошибка, из-за того, что в kotlin нельзя объявлять переменную без указания типа
    val intArray3 = intArrayOf() // все окей
    // явное проставление типов мы используем только для наглядности.

    // Объявления массивов через val и var
    val intArray4 = intArrayOf(1, 2, 3, 4, 5)
//    intArray4 = intArrayOf(1, 2, 3, 4, 5) // Error: val cannot be reassign


    var intArray5 = intArrayOf(1, 2, 3)
    intArray5 = intArrayOf(1, 2, 3, 4, 5)

    // Array size
    println("Размер массива с ингредиентами: ${arrayOfIngredients.size}")

    // indexOf function - get index of element by value
    println("Размер массива с ингредиентами: ${arrayOfIngredients.indexOf("помидор")}")

    println(arrayOfIngredients[1]) // помидор
    println(arrayOfIngredients[2]) // зелень


    arrayOfIngredients[4] = "паприка"
    println(arrayOfIngredients[4]) // паприка

    // Функции set() и get()

    arrayOfIngredients.set(1, "капуста")
    println(arrayOfIngredients.get(1)) // капуста

    for (i in arrayOfIngredients) {
        println("Ингредиент ${arrayOfIngredients.indexOf(i) + 1}: $i")
    }


}