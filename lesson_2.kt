// 【条件分岐】

// if文---------------------------------------

var str = "大吉"
val rnd = Random
val number = rnd.nextInt(5) // 0 ~ 4
if (number == 0) {
    str = "中吉"
}
else if (number == 1) {
    str = "吉"
}
else if (number == 2) {
    str = "凶"
}
else if (number == 3) {
    str = "大凶"
}
else {
    str = "大吉" // 必要なければ省略可能
}


// when文-------------------------------------

when (number) {
    0 -> str = "中吉"
    1 -> str = "吉"
    2 -> str = "凶"
    3 -> str = "大凶"
    else -> str = "大吉" // 必要なければ省略可能
}


// if文とwhen文は『式』としても使える-----------------

val str = if (number == 0) {"吉"} else {"凶"}
// numberが0なら吉、そうでなければ凶

val str = when (number) {
    0 -> "吉"
    1 -> "凶"
    else -> "大吉"
} // numberが0なら吉、1なら凶、それ以外なら大吉

// ※ 両方とも『式として用いる場合』は必ず値を返す必要がある為、elseは省略できない。