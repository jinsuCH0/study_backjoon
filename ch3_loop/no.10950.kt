import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    val arr = IntArray(t)
    for (i in 1..t) {
        val a = sc.nextInt(); val b = sc.nextInt()
        arr[i-1] = a+b
    }
    arr.forEach { println(it) }
}
