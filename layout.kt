// xmlファイル内で使用する主要コードの使い方例(メモ)
// すべて頭に android: が付く。

// 主な使用タグ
// <RelativeLayout> <LinearLayout> <ImageView> <TextView> <Button>


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


・scr = "場所/ファイル名"  -- 画像
・background = "場所/ファイル名"  -- 背景画


・scaleType = "fitXY"