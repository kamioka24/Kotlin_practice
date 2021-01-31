// 配列 --------------------------------------------------------------
/*
kotlinでは配列において、ミュータブル(変更可能)なものと、
イミュータブル(変更不可能)なものを区別する
*/

Arrayはミュータブルだが、List、Setはイミュータブル
val numbers: List<Int> = listOf<Int>(1, 2, 3)
numbers[0] = 5
=> // 変更できないからコンパイルエラーが起こる

MutableList や MutableSet とすると、変更や、追加・削除もできるようになる。
ただし、setの場合は順序の保証ができないため、インデックスによるアクセスはできない。



val rnd = Random
val number = rnd.nextInt(20) // 0 ~ 19
val omikujiShelf = Array<String>(20, {"吉"}) // Arrayクラスの宣言と初期化
// Array<配列の型>(要素の数, {初期化処理})
omikujiShelf[0] = "大吉"
omikujiShelf[19] = "凶"
val str = omikujiShelf[number]
// 大吉、凶が出る確率は低い(今回の場合は20分の1ずつになる)


// 配列を使った【forループ】----------------------------------------------

/* for( 任意の変数名 in イテレータブルなオブジェクト ) {
    処理
   }
*/
// イテレータブルなオブジェクト => 配列のように順番にアクセスできるもの
val array = arrayOf("a", "b", "c", "d", "e")
for(i in array) println(i)


// ランダム関数使用例 ----------------------------------------------------

fun main() {
	val diceRange = 1..6 // 1 ~ 6
	val randomNumber = diceRange.random()
    println("Ramdom number: ${randomNumber}")
}


// サイコロアプリ(例) ----------------------------------------------------

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


// サイコロアプリ(例2) ----------------------------------------------------

fun main() {
    val myFirstDice = Dice()
    val diceRoll = myFirstDice.roll()
    println("${myFirstDice.sides}面のサイコロを振って、${diceRoll}が出た！")
}

class Dice {
    var sides = 8

    fun roll(): Int {
        val randomNumber = (1..sides).random()
        return randomNumber
    }
}


// サイコロアプリ(2つのサイコロを振る例) --------------------------------------
fun main() {
    val myFirstDice = Dice(6)
    println("${myFirstDice.numSides}面のサイコロを振って${myFirstDice.roll()}が出た!!")

    val mySecondDice = Dice(12)
    println("${mySecondDice.numSides}面のサイコロを振って${mySecondDice.roll()}が出た!!")
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}