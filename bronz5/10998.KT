import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val (n,m) = inputTwoInt()
    val answer = n*m

    print(answer)
}

fun inputTwoInt () : Pair<Int, Int> {
    val br = BufferedReader(InputStreamReader(System.`in`)) // 입력받을 때 다른 방식으로 받게 하는 방식
    val (n : Int, m : Int) = br.readLine()
        .split(" ")
        .map { it.toInt() }
    return Pair(n,m)
}
