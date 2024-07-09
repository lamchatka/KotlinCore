fun main() {


    // 3. Kotlin strings. Interpolation. Concatenation


    // String concatenation/Конкатенация строк

    println("Какой будет ваш главный вопрос?")

    val greetings = "Здравствуйте"
    val space = ' '
    println(greetings + "!" + space + "Какой будет ваш главный вопрос?")

    val userName = "Звездный лорд"
    println(greetings + ", " + userName + "!" + space + "Какой будет ваш главный вопрос?")

    // String templates/ Строковые шаблоны (интерполяция строк)

    println("$greetings, $userName! Какой будет ваш главный вопрос?")
    println("На который можно ответить ${40 + 2}")

    // Многострочное интерполирование

    val multiString1 = """
             строка1
        строка2
            строка3
    """

    println(multiString1)

    /*
     Returned ->
                 строка1
            строка2
                строка3

     Все оригинальные отступы сохранены.
     */

    val multiString2 = """
             строка1
        строка2
            строка3
    """.trimIndent()

    /*
    Функция trimIndent() обнаруживает общий минимальный отступ (слева)
    у всех строк и удаляет его из каждой строки.
     */

    println(multiString2)

    /*
     Returned ->
         строка1
    строка2
        строка3

     */


    // trimMargin()

    /*
    Функция trimMargin() приравнивает все строки с разными отступами
    к левому краю одинаково
     */

    val multiString3 = """
             |строка1
        |строка2
            |строка3
         
    """.trimMargin()

    println(multiString3)

    /*
    Returned ->
    строка1
    строка2
    строка3

     */

    // Тест по уроку 3

    // 1. в каком случае текст запишется в одну строку.

    // 1
    val str1 = "a" +
            "b" +
            "c" +
            "d"

    println(str1) // abcd

    // 2
    val str2 = "a\n" +
            "b\n" +
            "c\n" +
            "d"

    println(str2) //

    // 3
    val str3 = """ 
a 
b 
c 
d 
    """
    println(str3) //

    // 4
    val str4 = "a\nb\nc\nd"
    println(str4) //






}