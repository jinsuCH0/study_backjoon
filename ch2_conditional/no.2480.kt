import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    if(a == b && b == c) print(10000+(a*1000))
    else if(a != b && b!=c && c!=a) print(maxOf(a,b,c)*100)
    else {
        if (a == b) print(1000 + (a*100))
        else if (b==c) print(1000 + (b*100))
        else print(1000 + (c*100))
    }
}
