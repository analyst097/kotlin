package basics

class Idioms {
}

//DTOs

data class Customer(val name: String, val email: String);

//default values for function params

fun foo(a: Int=0, b: String){}

//Filter a List

val list = listOf(1,2,-1,3,-3,-4);
val positives =  list.filter { it >0 }

//Check for an element in collection

fun check(){
    if(-1 in list){
        print("-1 in list")
    }
}

//Check for instances of type

fun checkInstance(x: Any){

    when(x){
        is Int-> print("INt")
        is String -> print("String")
    }
}

//Readonly list

val lists = listOf(1,2,3,4)


//Readonly Map
val map = mapOf("name" to "adi",)

fun mapValue(){
    print(map["key"])
}


//Extension functions

fun String.spaceToCamelCase(){
    print("convert the space to camelcase")
}

//Singleton
object Resource{
    val name = "Name"
}





















