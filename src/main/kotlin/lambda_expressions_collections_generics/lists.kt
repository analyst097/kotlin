package lambda_expressions_collections_generics

fun main() {
    val seasons = listOf("spring,", "summer", "rainy", "autumn", "winter" )
    val colors = listOf("violet", "indigo", "blue", "green", "yellow", "orange", "red")
    println(seasons.javaClass)  //java.util.Arrays@ArrayList

    val mutableSeasons = seasons.toMutableList()
    mutableSeasons.add("new season")
    println(mutableSeasons)

}

fun collectedFunctions(s: List<String>, c: List<String>){
    println(s.last())
    println(c.last())

    println(s.asReversed())
    println(c.asReversed())

    println(s.getOrNull(5))
    println(c.getOrNull(2))

    val nums = listOf(1,2,3,4,5)
    println(nums.maxOrNull())

    println(s.zip(c))  // pair of values - [ (spring, violet), .. ]

    val merged = s + c;
    println(merged)

    val unioned = s.union(c);
    println(unioned)

    val distincts = s.distinct();
    println(distincts)
}

