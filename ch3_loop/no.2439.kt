fun main() {
    val n = readln()!!.toInt()
    for (i in 1..n) {
        print(" ".repeat(n-i))
        print("*".repeat(i)+"\n")
    }
}
