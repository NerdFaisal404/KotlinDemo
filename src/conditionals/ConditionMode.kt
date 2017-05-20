package conditionals

/**
 * Created by Faisal Ahmed on 5/20/2017.
 */

fun main(args: Array<String>) {
    val mode: Int = 5;

    when(mode){
        1 -> println("This mode is lazy faisal mode")
        2 ->{
            println("This mode is 2.")
            println("So the mode is busy.")
        }

        3 -> println("This mode is super productive")
        else -> println("I don't know this mode.")
    }

}