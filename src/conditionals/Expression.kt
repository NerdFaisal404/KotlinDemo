package conditionals

/**
 * Created by Faisal Ahmed on 5/20/2017.
 */

fun main(args: Array<String>) {
    val mode: Int = 3;

    val result = when (mode) {
        1 -> "This mode is lazy faisal mode"
        2 -> {
            println("This mode is 2.")
            "So the mode is busy."
        }

        3 -> "This mode is super productive"
        else -> "I don't know this mode."
    }
    println(result)

    val x = if (mode < 2) {
        17
    } else {
        42
    }

    println(x)

}