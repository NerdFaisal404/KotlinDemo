package conditionals

/**
 * Created by Faisal Ahmed on 5/20/2017.
 */

fun main(args: Array<String>) {
    val mode: Int = 5;

    when (mode) {
        1 -> println("This mode is lazy faisal mode")
        2 -> {
            println("This mode is 2.")
            println("So the mode is busy.")
        }

        3 -> println("This mode is super productive")
        else -> println("I don't know this mode.")
    }

    val x = 36;

    when (x) {
        5 -> println("X is 5")
        3 * 12 -> println("X is 3*12")
        "Hey Mofij".length -> println("X is length of 'Hey Mofij' ")
        in 1..10 -> println("X is between 1 and 10")
        in 11..20 -> println("X is between 11 and 20")
        in 21..30 -> println("X is between 21 and 30")
        !in 1..9 -> println("x is not between 1 to 9")
    }

}