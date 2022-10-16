import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val arr = IntArray(n); val aArray = IntArray(n); val bArray = IntArray(n)
    for (i in 0 until n) {
        val a = sc.nextInt(); val b = sc.nextInt()
        aArray[i] = a
        bArray[i] = b
        arr[i] = a+b
    }
    for ((index, item) in arr.withIndex()) println("Case #${index+1}: ${aArray[index]} + ${bArray[index]} = $item")
}
