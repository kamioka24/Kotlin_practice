fun main(args: Array<String>) {
  println("Hello World"); // セミコロンはあってもなくてもいい？
}

/*
複数行コメント
複数行コメント
複数行コメント
 */


// 変数
// vel => 再代入できない (多い)
// ver => 再代入できる
fun main(args: Array<String>) {
  // val msg: String = "Hello World"
	val msg = "Hello World" // 型推論(上の行の省略形)
	println(msg)
}


// データ型
/* 
<<文字列>> String, Char
Stringは " " で囲む          val s = "Hello"
Charは ' ' で囲む            val c = 'World'

<<整数値>> Byte, Short, Int, Long (右に行くほど大きい桁数を扱える。通常はInt)
val i: Int = 100
val l: Long = 55555555L (数値の最後に大文字のLをつける)

<<浮動点少数>> Float, Double (Doubleの方が桁数が大きいものを扱える)
val f: Float = 123.456F (数値の最後に大文字か小文字のFをつける)
val d: Double = 123.456

Boolean (true / false)
val flag: Boolean = true
*/