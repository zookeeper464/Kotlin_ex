import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val (n,m) = inputTwoInt()
    val plus = n+m; val minus = n-m; val multiple = n*m; val divide = n/m; val remain = n%m

    print("$plus\n$minus\n$multiple\n$divide\n$remain")
}

fun inputTwoInt () : Pair<Int, Int> {
    val br = BufferedReader(InputStreamReader(System.`in`)) // 입력받을 때 다른 방식으로 받게 하는 방식
    val (n : Int, m : Int) = br.readLine()
        .split(" ")
        .map { it.toInt() }
    return Pair(n,m)
}
