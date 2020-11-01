// 配列 ---------------------------------------------------

val rnd = Random
val number = rnd.nextInt(20) // 0 ~ 19
val omikujiShelf = Array<String>(20, {"吉"}) // Arrayクラスの宣言と初期化
// Array<配列の型>(要素の数, {初期化処理})
omikujiShelf[0] = "大吉"
omikujiShelf[19] = "凶"
val str = omikujiShelf[number]
// 大吉、凶が出る確率は低い


// 配列を使った【forループ】----------------------------------

/* for( 任意の変数名 in イテレータブルなオブジェクト ) {
    処理
   }
*/
// イテレータブルなオブジェクト => 配列のように順番にアクセスできるもの
val array = arrayOf("a", "b", "c", "d", "e")
for(i in array) println(i)
