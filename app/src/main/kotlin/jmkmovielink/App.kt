/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package jmkmovielink

class App {
    companion object : Logging {
        private val logger = logger()
    }

    val greeting: String
        get() {
            logger.info("Hello World!")
            return "Hello World!"
        }
}

fun main() {
    println(App().greeting)
}
