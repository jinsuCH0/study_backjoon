import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var sum = 0
    for (i in 0..n) sum += i
    println(sum)
}
