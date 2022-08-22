package lambda_expressions_collections_generics

fun main() {
    val immutableMap = mapOf(
        1 to Car("red", "audi", 2022),
        2 to Car("blue", "ford", 2022),
        3 to Car("green", "merecdes", 2022),
        4 to Car("white", "bmw", 2022),
    )

    println(immutableMap.javaClass)

    for ((key, value) in immutableMap) {
        println(key)
        println(value)
    }

    val car = Car("white", "bmw", 2022)
    val (color, model, year) = car
    println("$model $color $year")
}

data class Car(val color: String, val model: String, val year: Int){
    //component functions to make a class de-constructable
    //data class have this inbuilt so no need to make explicit component fns
//    operator fun component1() = color
//    operator fun component2() = model
//    operator fun component3() = year
}
