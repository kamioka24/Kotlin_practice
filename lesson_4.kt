// 【メソッド】

onCreate()
/*
INITIALIZED(初期化)からCREATEDに変わるときに呼ばれる。
Activityのインスタンスが作られたときに一度だけ呼び出される。
通常Activityで表示するViewを作成。setContentView(R.layout.activity_main)を行ったりしてActivityで必要になるものを作っていく
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