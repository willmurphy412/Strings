fun main() {
    val ans1 = "299,792,458"
    val ans2 = "Mercury"
    val ans3 = "Jupiter"
    val ans4 = "Oort Cloud"
    val ans5 = "Sol"
    var userInput = ""
    var total = 0

    //Start of Quiz and first question
    println("""
        Let's take 5 question Astronomy Quiz
        Question 1: What is the speed of light? (Please enter answer with commas)
    """.trimIndent())
    userInput = readLine()!!

    var result = userInput.compareTo(ans1,true)
    if(result == 0) {
        println("Correct")
        total++
    }
    else
        println("Incorrect")

    //Question 2 with Answer check
    println("Question 2: What is the smallest planet in our solar system?")
    userInput = readLine()!!

    result = userInput.compareTo(ans2, true)
    if(result == 0){
        println("Correct")
        total++
    }
    else
        println("Incorrect")

    //Question 3 with Answer check
    println("Question 3: What is the largest planet in our solar system?")
    userInput = readLine()!!

    result = userInput.compareTo(ans3, true)
    if(result == 0) {
        println("Correct")
        total++
    }
    else
        println("Incorrect")

    //Question 4 with Answer check
    println("Question 4: What is the spherical shell, beyond Pluto, that surrounds our solar system?")
    userInput = readLine()!!

    result = userInput.compareTo(ans4, true)
    if(result == 0) {
        println("Correct")
        total++
    }
    else
        println("Incorrect")

    //Question 5 with Answer check
    println("Question 5: What is the name of our Sun?")
    userInput = readLine()!!

    result = userInput.compareTo(ans5, true)
    if(result == 0) {
        println("Correct")
        total++
    }
    else
        println("Incorrect")

    //Quiz Grade
    println("You scored $total/5")
}