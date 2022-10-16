import java.util.Scanner
fun main() {
    var sum = 0
    val sc = Scanner(System.`in`)
    val x = sc.nextInt(); val n = sc.nextInt()
    for (i in 1..n) {
        val a = sc.nextInt(); val b = sc.nextInt()
        sum += (a*b)
    }
    if (x==sum) println("Yes") else println("No")
}
