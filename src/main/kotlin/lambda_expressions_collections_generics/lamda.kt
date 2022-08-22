package lambda_expressions_collections_generics

fun main(){
    val emps = listOf<Employee>(
        Employee("aditya", "sahu", 2020),
        Employee("alok", "sahoo", 2001),
        Employee("ankit", "ranjan", 2010),
    );

    println(emps.minByOrNull { employee -> employee.startYear })

    //lambdas with receivers

    countTo100()
    countTo100WithReceiver()
    findByLastName(emps, "sahu")

    "Some String".apply somestring@{
        "Another String".apply {
            println(lowercase())
            println(this@somestring.uppercase())
        }
    }


}

fun findByLastName(emps: List<Employee>, lastname: String){
    emps.forEach returnBlock@{
        if( it.lastname.lowercase() == lastname.lowercase()){
            println("Employee ${it.firstname + ' ' + it.lastname}")
            return@returnBlock
        }
    }
    println("No employee with last name $lastname")
    println("after return")
}

/**
 * lambda with receiver
 */
fun countTo100WithReceiver(){
    return with(StringBuilder()) {
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
        toString()
    }
}

fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append(i)
        numbers.append(", ")
    }
    return numbers.toString()
}

data class Employee(
    val firstname: String,
    val lastname: String,
    val startYear: Int
){
}