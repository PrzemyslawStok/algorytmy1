import kotlin.random.Random

fun main() {
    val tab = arrayListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(tab)

    val set = mutableSetOf(1, 2, 10, 2, 2)
    println(set)

    //1,1,1,1,1,2,2,2,2,2,3,3,3,3,3,4,4,4,4,4,5,5,5,5,5

    for (i in 1..5) {
        for (j in 1..5) {
            tab.add(i)
            set.add(i)
        }
    }

    println(tab)
    println(set)

    val no = Random.nextInt(1, 10)

    for (i in 1..10)
        tab.add(Random.nextInt(0, 2))

    println(tab)

    set.addAll(tab)

    println(set)

    val tab1 = tab.filter { it % 2 == 0 }

    println(tab1)


    tab1.forEach { println("element: ${it}") }
    println(tab1.map { it * it })


}
