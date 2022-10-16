import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val x = sc.nextInt()
    val arr = mutableListOf<Int>()
    for (i in 1..n) {
        val k = sc.nextInt()
        arr.add(k)
    }
    arr.forEach{ if (x > it) print("$it ") }
}
