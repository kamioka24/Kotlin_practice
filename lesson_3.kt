// 配列 ---------------------------------------------

val rnd = Random
val number = rnd.nextInt(20) // 0 ~ 19
val omikujiShelf = Array<String>(20, {"吉"})
omikujiShelf[0] = "大吉"
omikujiShelf[19] = "凶"
val str = omikujiShelf[number]
// 大吉、凶が出る確率は低い


// 配列を使ったforループ
val array = arrayOf("a", "b", "c", "d", "e")
for (i in array) println(i)