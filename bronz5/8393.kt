fun main () {
    val n = readLine()!!.toInt()
//    var answer = 0
//    for (i: Int in 1..n)
//        answer += i
    val answer = (1..n).sum()
    print(answer)
}
