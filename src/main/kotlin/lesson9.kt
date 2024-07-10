fun main() {

    // 9. Collection

    // List(список), Set(множество), Map(словарь или ассоциативным список)

    // List
    /*
    Отличия от массивов
Первое. Массив имеет строго фиксированный размер и не может уменьшаться или увеличиваться. Изменить размер массива можно только создав его копию с дополнительными или утраченными элементами. Списки же имеют методы add и remove для добавления/удаления элементов.
Второе. Массив предоставляется классом Array<T>. List<T> является интерфейсом и имеет разные реализации со своим функционалом.
Третье. Массивы оптимизированы для примитивов и меют отдельные типа IntArray, CharArray и т.д. Списки такой оптимизации не имеют.
Четвертое. Различается процесс сравнивания элементов друг с другом. В массивах сравниваются адреса ячеек в памяти, в списках же идет сравнение самого значения.
     */

    // Создание списков
    val list = listOf(4, 4, 2) // Неизменяемый список (immutable)
    // val list: List<T> = listOf(4, 4, 2)
    // Его “неизменяемость” определяется тем, что нельзя просто так взять и обратиться по индексу к элементу и заменить его на другой.
    //    list[0] = 7 - синтаксическая ошибка

    // Mutable (изменяемый) список
    val mutableList: MutableList<Int> = mutableListOf(4, 4, 2)
    mutableList[0] = 7
    println(mutableList)

    // add()
    mutableList.add(42)
    println(mutableList) // [7, 4, 2, 42]

    mutableList.add(0, 42)
    println(mutableList) // [42, 7, 4, 2, 42]

    // contains()
    println(mutableList.contains(42)) // true

    // isEmpty() and IsNotEmpty()
    println(mutableList.isEmpty()) // false
    println(mutableList.isNotEmpty()) // true

    // indexOf() and lastIndexOf()
    println(mutableList.indexOf(42)) // 0
    println(mutableList.lastIndexOf(42)) // 4

    // sort(), sortDescending(), reverse()
    mutableList.sort() //
    mutableList.sortDescending() //
    mutableList.reverse() //
    mutableList.forEach {
        println(it)
    }
   // 2 4 7 42 42

    // filter()
    val mutableList2 = mutableList.filter{
        it == 42
    }

    mutableList2.forEach{
        println(it)
    }

    // map()
    val mutableList3 = mutableList2.map{
        it * 2
    }

    println(mutableList3)






}