import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    if (a > 0 && b > 0) print(1)
    else if (a > 0 && b < 0) print(4)
    else if (a < 0 && b > 0) print(2)
    else print(3)
}
