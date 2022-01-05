import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val (n,m,k) = inputThreeInt()
    val a = (n+m)%k
    val b = ((n%k)+(m%k))%k
    val c = (n*m)%k
    val d = ((n%k)*(m%k))%k

    print("$a\n$b\n$c\n$d")
}

fun inputThreeInt () : Triple<Int, Int, Int> {
    val br = BufferedReader(InputStreamReader(System.`in`)) // 입력받을 때 다른 방식으로 받게 하는 방식
    val (n : Int, m : Int, k : Int) = br.readLine()
        .split(" ")
        .map { it.toInt() }
    return Triple(n,m,k)
}
