import java.util.Scanner
fun main() = with(Scanner(System.`in`)) {
    for (i in 1..nextInt()) {
        for (j in 1..i) print("*")
        println()
    }
}
