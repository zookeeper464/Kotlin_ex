class LottoSolution {
    fun solution(lottos: IntArray, win_nums: IntArray): IntArray {
        val win = win_nums.toHashSet()
        var max = 0
        var min = 0
        lottos.forEach {
            if(it == 0) max++
            if(win.contains(it)) min++
        }
        max += min
        
        fun rank(n:Int) : Int {
            if(n < 2) return 6
            else return 7-n
        }
        
        return intArrayOf(rank(max), rank(min))
    }
}
