fun main() {

    // 2. Arithmetic operations, division remainder


    val a = 5
    val b = 7
    val sum = a + b

    // val c  // Переменная не может быть объявлена без типа. Программа Упадет на этапе компиляции: This variable must either have a type annotation or be initialized

    val c1 = 888
    val c2: Int

    //    println(sum)
//    println(10 / 3) // return 3 only integer part

    val intNum1: Int = 10
    val intNum2: Int = 3
//    println(intNum1 / intNum2) // 3

    val floatNum1: Float = 10f
    val floatNum2: Float = 3f
//    println(floatNum1 / floatNum2) // 3.3333333

    val doubleNum1: Double = 10.0
    val doubleNum2: Double = 3.0
//    println(doubleNum1 / doubleNum2) // 3.3333333333333335


    // Остаток от деления
//    println(10 % 3) // 1
//    println(10 % 2) // 0

    // Конечный тип переменной

    val c = intNum1 + floatNum1 // Если в выражении присутствуют одновременно целочисленные и вещественные типы, то результат всегда будет дробный
//    println(c) // float
//    println(c::class) // ссылка на Kotlin class
//    println(c::class.simpleName) // имя Kotlin класса

    val d = intNum1 + floatNum1 + doubleNum1 // Если в выражении присутствуют одновременно float и double, то результат будет double (преимущество по вмещающей памяти 4 байт против 8 байт)
//    println(d) // double
//    println(d::class) // ссылка на Kotlin class
//    println(d::class.simpleName) // имя Kotlin класса

    // Оператора :: (двойное двоеточие) является сслылкой на метод или класс

    // Increment and decrement

    var counter = 0

    counter = counter + 1
    counter += 1
    counter++

//    println(counter)
    counter -= 1
    counter--

//    println(counter)

    var i = 0
//    println(i) // 0
//    println(i++) // print 0 but i equal 1
//    println(i) // 1

    println(i) // 0
    println(++i) // 1
    println(i) // 1


    // операторы сравнения

//    println(a > b) false
//    println(a < b) true
//    println(a >= b) false
//    println(a <= b) true
//    println(a == b) false
//    println(a != b) true
}