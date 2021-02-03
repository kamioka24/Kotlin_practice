// 【メソッド】

onCreate()
/*
INITIALIZED(初期化)からCREATEDに変わるときに呼ばれる。
Activityのインスタンスが作られたときに一度だけ呼び出される。
通常Activityで表示するViewを作成。setContentView(R.layout.activity_main)を行ったりしてActivityで必要になるものを作っていく。
*/


onStart()
/*
CREATEDからSTARTEDに変わるときに呼ばれる。
画面が表示されたタイミングで発火する。
*/


onResume()
/*
STARTEDからRESUMED(再開)に変わるときに呼ばれる。
画面がフォーカスを持ったタイミングで発火される。 ※ フォーカスとは入力要素などを一つ選択し、文字入力や操作を受け付けられる状態にすること。
ログ計測などで使われることがあるが、そこまで頻繁に使用されているメソッドではない。
フォーカスがあったときに更新したい場合は使うといい。
*/


onSaveInstanceState()
/*
onStop()の前に呼び出される、メソッド。
Activityが破壊されるときにデータを保存しておいて、取り出すことができる。
例えば、通常は画面回転をするとデータが破壊され、最初からになってしまうのが、この処理をすることで回転させてもデータが継続して反映される。
ただし大きすぎるデータや、1つ1つ保存するのには向いていない。
*/


savaData()
/*
データの格納をする際に使用するメソッド
()内に引数: データ型を記述
*/


getDefaultSharedPreferences()
/*
デフォルトの共有プリファレンスを取得する
*/


getInt()
/*
設定項目をInt型で取得する
()内に、取り出したい設定項目の名前: 値(設定項目が未設定の場合にはこの値を返す) を記述
この他にも getString や getBoolean などがある
*/


putInt()
/*
設定項目にInt型の値を書き込む
()内に、書き込みたい設定項目の名前: 書き込む値 を記述
この他にも putString や putBoolean などがある
*/


apply(), commit()
/*
データの保存
*/


clear()
/*
保存内容をクリアする(初期化する)
*/


replace()
/*
文字列の置き換え。
("古い文字列”, "置き換える文字列")
*/


contains()
/*
コンテンツに〇〇が含まれるか否かを判定。
("文字列の指定")
*/
val text = "頑張ろう、日本！"
val message = (text.contains("日本")
println(message) // => true


Math.random() // Javaの標準ライブラリのAPI。
/*
擬似乱数を返す
*/


setImageResource()
/*
指定したリソースの画像を表示するメソッド
画像のリソースIDは R.drawable.画像ファイル名
*/


onButtonClick()
/*
ボタンタグをクリックした際の処理を実行する
*/


setOnClickListener
/*
クリック時に処理する動作を定義する
*/


ViewModel
/*
データ保持を楽にしてくれるコンポーネント。いちいち保存する必要がない
↓↓ こちらで暗黙的にActivityのインスタンスが渡されている。
viewModel.addOnResponseChangedListener { response ->
*/