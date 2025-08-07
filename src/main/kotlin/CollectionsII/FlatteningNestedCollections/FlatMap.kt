package CollectionsII.FlatteningNestedCollections

//Use flatten() to get a single list of all scores.
//Calculate the average score across all classes.
//Use flatMap() to create a list of grade letters:
//90+ → "A"
//80-89 → "B"
//70-79 → "C"
//60-69 → "D"
//<60 → "F"
fun main(){
    val classScores = listOf(
        listOf(78, 85, 90),
        listOf(66, 74, 80, 92),
        listOf(88, 79)
    )
    println(classScores.flatten())

}