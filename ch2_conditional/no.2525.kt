import java.util.Scanner
import kotlin.math.abs
fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt(); val b = sc.nextInt()
    val c = sc.nextInt()
    val min = (a * 60) + b + c
    if (min / 60 >= 24)
        println("${abs(24 - (min / 60))} ${min % 60}")
    else
        println("${min / 60} ${min % 60}")
}
