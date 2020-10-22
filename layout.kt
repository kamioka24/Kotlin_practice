// xmlファイル内で使用する主要コードの使い方例
// すべて頭に android: が付く。

・layout_with = "200dp"
・layout_heigth = "300dp"
-----両方に共通すること-----
・"match_parent"  -- 親要素の大きさまで目一杯広げる
・"wrap_content"  -- viewを表示するのに十分なサイズになる


・textSize = "15dp"
・textColor = "@color/blackColor"


・layout_constartraintStart_toEndOf = "parent"
　他にもtoStartOf, toTopOf, toBottomOfなどがある


・layout_marginTop = "50dp"  -- 上から50dp離す
　他にもmarginBottom, marginLeft, marginRightなどがある