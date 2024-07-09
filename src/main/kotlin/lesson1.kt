fun main() {

    // 1. Variables and their types

    val numberOfOrders = 40
    val notificationText = "Маски больше не потребуются!"

    println(numberOfOrders)
    println(notificationText)

    // Integer types
    val byteNum: Byte // 8 bit, range  -128 to 127
    val shortNum: Short // 16 bit, range
    val intNum1: Int = -2147483648 // 32 bit
    val intNum2: Int = 2147483647 // 32 bit
    val longNum: Long // 64 bit, range

    // And unsigned number types
    val unsignedIntNum: UInt = 2147483648u

    // Floating-point types
    val doubleNum: Double = 234.52 // by default
    val floatNum: Float = 847.34f

    // Strings
    val charValue: Char = '1'
    val stringValue: String = "Это строка"

    // Boolean
    val trueValue: Boolean = true
    val falseValue: Boolean = false


    // 2. Arithmetic operations,

}


// Simple calculator

// Declaration and initialization block
//    var input1: Float? = null
//    var input2: Float? = null
//    var operator: Char? = null
//    var result: Float? = null // Declare variable without initialization
//
//    print("Первое значение:")
//    input1  = readLine()
//
//    // Data validation
//    if (input2.toInt() == 0 && operator == '/') {
//        println("Нельзя делить на 0!!!")
//
//    } else {
//        // When expression
//        result = when (operator) {
//            '+' -> input1 + input2
//            '-' -> input1 - input2
//            '*' -> input1 * input2
//            '/' -> input1 / input2
//            else -> null
//        }
//        println(result)
//    }


//    when (operator) {
//        '+' -> result = (input1 + input2).toFloat()
//        '-' -> result = (input1 - input2).toFloat()
//        '*' -> result = (input1 * input2).toFloat()
//        '/' -> result = (input1 / input2).toFloat()
//        else -> println("Вы ввели неверную операцию")
//    }
