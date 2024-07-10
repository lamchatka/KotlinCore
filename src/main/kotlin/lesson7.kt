fun main() {

    // 7. For loop, ranges (intervals)

    // Ranges (intervals)
    val range1 = 42..442
    val range2 = 42 until 442

    val range3 = 42L..442L
    val range4 = 'a'..'z'
    val range5 = 42.1..442.1
    val range6 = 42.1f..442.1f

    val intRange1: IntRange = 42..442 // IntRange
    val intRange2: IntRange = 42 until 442 // IntRange
    val longRange: LongRange = 42L..442L // LongRange
    val charRange: CharRange = 'a'..'z' // CharRange
    val closedRangeDouble: ClosedRange<Double> = 42.1..442.1 // ClosedRange<Double>
    val closedRangeFloat: ClosedRange<Float> = 42.1f..442.1f // ClosedRange<Float>

    //  !!!! Диапазоны с типом ClosedRange нельзя использовать для итерации по их значениям.

    // step function
    val range7: IntProgression = 42..442 step 2

    //  downTo function
    val range8: IntProgression = 442 downTo 42 step 2
    val range9: IntProgression = 442 downTo 42

    // Принадлежность к интервалу in, !in
    val a = 52 in range1
    val b = 52 !in range1
    println(a)
    println(b)

    // for loop
//    for (i in 5 downTo 1) {
//        println("Реклама закончится через $i")
//        Thread.sleep(1000)
//    }

    // i-variable - создается в рамках текущего цикла. Она будет служить контейнером для текущего элемента из предоставляемого списка, которое мы распечатываем
    // downTo - некая коллекция

    // Шаг прохода step

//    for (i in range2 step 8) { // 42 to 434 with step 8
//        println(i)
//    }

    // Операторы перехода break, continue, return

    // break operator
//    for (i in 5 downTo 1) {
//        if (i == 3) {
//            println("Пользователь нажал на кнопку \"Пропустить\"")
//            break
//        }
//        println("Реклама закончится через $i")
//        Thread.sleep(1000)
//    }
//    println("Продолжение работы программы вне цикла")

    // continue operator
//    for (i in 5 downTo 1) {
//        if(i == 3) {
//            println("i == 3, i не будет распечатана")
//            continue
//        }
//        println("Реклама закончится через $i")
//        Thread.sleep(1000)
//    }

    // return operator
    /*
    В этом случае программа завершает выполнение функции в которой она находится.
    В нашем случае это метод main().
    То есть в текущих условиях мы полностью остановим выполнение программы,
    так как у нас запущена одна единственная исполняемая функция main().
     */

    for (i in 5 downTo 1) {
        if(i == 3) {
            return
        }
        println("Реклама закончится через $i")
        Thread.sleep(1000)
    }
    println("Продолжение работы программы вне цикла")

}