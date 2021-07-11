/*
 【可変長引数】
*/

fun main() {
    println(allSum(3, 9, 4, 12, 20))
}

fun allSum(vararg scores: Int): Int { // vararg によって、引数を複数指定することが可能(任意数)
    var scoreSum = 0
    for (score in scores) {
        scoreSum += score
    }
    return scoreSum
}
// 48

/*
 可変長引数には配列を渡してあげることもできる
*/

fun main() {
    val array = intArrayOf(3, 9, 4, 12, 20)
    println(allSum(*array)) // 必ず * を付けなくてはいけない。(配列の中身全てという意味)
}
// 48

fun allSum(vararg values: Int): Int {
    var result = 0
    for (value in values) {
        result += value
    }
    return result
}

/*
 配列と普通の値のミックスもできる
*/

fun main() {
    val array = intArrayOf(3, 9, 4, 12, 20)
    println(allSum(2, *array, 5)) // 配列と普通の値のミックス
}
// 55

fun allSum(vararg values: Int): Int {
    var result = 0
    for (value in values) {
        result += value
    }
    return result
}



/*
 【複数の戻り値を持つ関数】
*/

fun main() {
    val (sum, average) = getSumAverage(2, 3, 9, 10)
    println(sum)
    println(average)
}
// 24
// 6.0

// もし戻り値をひとつしか使わない場合は...
// val (sum, _) = getSumAverage(2, 3, 9, 10) と書ける。(必要なければ不本意に使わぬよう、_ を使用する。)

fun getSumAverage(vararg values: Int): Pair<Int, Double> { // Pair を使うことで戻り値を2つ持てる。(3つのときは Triple)
    var result = 0
    var count = 0.0
    for (value in values) {
        result += value
        count ++
    }
    return Pair(result, result / count)
}