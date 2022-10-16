import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val h = sc.nextInt()
    when (val m = sc.nextInt()) {
        in 45..59 -> print("$h ${m-45}")
        0 ->
            if(h == 0) print("23 ${m+15}")
            else print("$h ${m-45}")
        else ->
            if (h == 0) print("23 ${(m+15)}")
            else print("${h-1} ${(m+15)}")
    }
}
