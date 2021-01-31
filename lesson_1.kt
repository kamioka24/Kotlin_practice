// 最初に押さえておきたいKotlinの言語仕様

// 【基本構文】
fun main() {
    println("Hello World")
}
print    ->  改行なし
println  ->  改行あり



// 【定数と変数】
vel -> 定数 (再代入できない)
constをつけることで定義
例) const val TAX_NUMBER = 1.10 // アンダースコア区切りの大文字

ver -> 変数 (再代入できる)
fun main(args: Array<String>) {
    // val msg: String = "Hello World"
    val msg = "Hello World" // 型推論(上の行の省略形)
    println(msg)
}



// 【データ型】
<<文字列>> String, Char
Stringは " " で囲む          val s = "Hello"
Charは ' ' で囲む            val c = 'World'

<<整数値>> Byte, Short, Int, Long // 右に行くほど大きい桁数を扱える。通常はInt
val i: Int = 100
val l: Long = 55555555L // 数値の最後に大文字のLをつける

<<浮動点少数>> Float, Double // Doubleの方が桁数が大きいものを扱える
val f: Float = 123.456F // 数値の最後に大文字か小文字のFをつける
val d: Double = 123.456

Boolean (true / false)
val flag: Boolean = true

// 暗黙の型変換はできないがメソッドを使えば型変換できる
val int: Int = 1234
val long: Long = int // => error

val int: Int = 1234
val long: Long = int.toLong() // => 1234
// .toInt() や .toString() などで型変換が可能に！



// 【null typeとnone null type】
// できるだけnone null typeを使う
var a: String = "abc"  // none null type
a = null               // 代入できない。エラーが出る
val l = a.length       // 文字の長さを出力

var a: String? = "abc" // null type
a = null               // 代入できる
val l = a.length       // nullチェックしていないためエラーが出る。(a!!.lengthにすればできる)



// 【nullなら実行しない安全呼び出し】
val thread: Thread? = null
thread?.start() // -> 何も起こらない



// 【nullの代替値】
textView.setText(name?: "no name")

// dataがnullになるならreturnする
val data = Hoge.getData ?: return



// 【raw string】
// 改行を含め、書いた通りに表現するにはダブルクォーテーション3つで囲む
fun main(args: Array<String>) {
    val text = """
        |むかしむかし
        |あるところに
        |じーさんばーさんが
        """.trimMargin() // 行頭の | は目印でそれを含まないようにtrimMarginしている
    println("$text")
}