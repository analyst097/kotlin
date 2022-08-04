package basics

import java.lang.Exception
import kotlin.*;

fun main(args: Array<String>){

    print(parseToInt("123s"))

}

fun sum(a: Int, b:Int): Int{
    return a + b;
}

fun sum2(a: Int, b: Int) = a+b;

fun unitFun(): Unit{

}

//VARIABLES

val readonly = 1;

var readwrite= 2;


//CLASS

class Shape

class Shape2(var l: Double, var w: Double){
    var perimeter = (l+w)*2;
}

//for loop
fun loop(){
    var list = listOf<Int>(1,3,3,4,5);
    for (item in list){
        println(item)
    }

    for (index in list.indices){
        println("$list[index]")
    }
}

//when expression

fun whenExp(obj: Any): String =
    when(obj){
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a String"
        else -> "Unkown"
    }

//Ranges

fun ranges(){

    //check if a number is in range
    val x = 10
    val y = 20
    if(x in 1..y){
        print("Yes")
    }

    //check if a number is out of range
    val list = listOf(1,2,3,4)

    if(-1 !in 0..list.lastIndex){
        print("-1 is out of range")
    }

    //iterate over a range
    for (x in 1..10){
        print(x)
    }


    //iterate in steps
    for (x in 1..10 step 2){
        print(x)
    }
}



//Collections

fun collections(){
    val items = listOf(1,2,3,4)
    //iterate over a collection
    for (item in items){
        print(item)
    }

    //check if a collection contains an object using in operator

    when{
        1 in items -> print("yes")
        0 in items -> print("no")
    }


    //use lambda expressions to filter and map collections

    val ids = listOf(1,2,3,4,5,3,2,12,23,4)
    ids
        .filter { it.equals(2) }
        .sortedBy { it }
        .map { it.toString() }
        .forEach{ print(it) }
}

//Nullable values and Null CHecks

fun parseToInt(str: String): Int?{
    return str.toIntOrNull()
}


//Type checks and automatic casts

fun getStringLength(obj: Any): Int?{
    if(obj is String){

        //autocasting to String
        return obj.length
    }

    return null
}

































