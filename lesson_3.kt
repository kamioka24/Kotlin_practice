// 配列 ---------------------------------------------------

val rnd = Random
val number = rnd.nextInt(20) // 0 ~ 19
val omikujiShelf = Array<String>(20, {"吉"}) // Arrayクラスの宣言と初期化
// Array<配列の型>(要素の数, {初期化処理})
omikujiShelf[0] = "大吉"
omikujiShelf[19] = "凶"
val str = omikujiShelf[number]
// 大吉、凶が出る確率は低い(今回の場合は20分の1ずつになる)


// 配列を使った【forループ】----------------------------------

/* for( 任意の変数名 in イテレータブルなオブジェクト ) {
    処理
   }
*/
// イテレータブルなオブジェクト => 配列のように順番にアクセスできるもの
val array = arrayOf("a", "b", "c", "d", "e")
for(i in array) println(i)


// ランダム関数使用例 ---------------------------------------

fun main() {
	val diceRange = 1..6 // 1 ~ 6
	val randomNumber = diceRange.random()
    println("Ramdom number: ${randomNumber}")
}


// サイコロアプリ(例) ---------------------------------------

fun main() {
    val myFirstDice = Dice()
    println(myFirstDice.sides)
    myFirstDice.roll()
}

class Dice {
    var sides = 6 // 面の数を指定

    fun roll() {
        val randomNumber = (1..6).random()
        println(randomNumber)
    }
}
// => 1行目に面の数が出力され、2行目に面の数以下の数字がランダムに出力される