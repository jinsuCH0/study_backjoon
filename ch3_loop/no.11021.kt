import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = IntArray(n)
    for (i in 0 until n) {
        val a = sc.nextInt(); val b = sc.nextInt()
        arr[i] = a+b
    }
    for ((index, item) in arr.withIndex()) println("Case #${index+1}: $item")
}
