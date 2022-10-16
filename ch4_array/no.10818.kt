import java.util.Collections.max
import java.util.Collections.min
import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val arr = mutableListOf<Int>()
    for (i in 1..a) arr.add(sc.nextInt())
    print("${min(arr)} ${max(arr)}")
}
