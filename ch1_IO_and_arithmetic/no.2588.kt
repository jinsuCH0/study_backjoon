import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextLine()
    val b = sc.nextLine()
    val c = (a.toInt()*b.substring(2..2).toInt()).toString()
    val d = (a.toInt()*b.substring(1..1).toInt()).toString()
    val e = (a.toInt()*b.substring(0..0).toInt()).toString()
    val f = a.toInt() * b.toInt()
    print("$c\n$d\n$e\n$f\n")
}
