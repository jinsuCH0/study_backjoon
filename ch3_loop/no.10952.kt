import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val aList = mutableListOf<Int>()
    val bList = mutableListOf<Int>()
    do{
        val a = sc.nextInt(); val b = sc.nextInt()
        if (a == 0 && b == 0) break
        else {
            aList.add(a)
            bList.add(b)
        }
    }while(a != 0 && b != 0)
    for(i in 0 until aList.size)
        println(aList[i] + bList[i])
}
