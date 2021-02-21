// 【アラートダイアログ】

AlertDialog.Builder(this) // FragmentではActivityを取得して生成
    .setTitle("タイトル")
    .setMessage("メッセージ")
    .setPositiveButton("OK", { dialog, which ->
        // OKが押された時の処理を記述
    })
    .setNegativeButton("NO", { dialog, which ->
        // NOが押された時の処理を記述
    })
    .setNeutralButton("その他", { dialog, which ->
        // その他が押された時の処理を記述
    })
    .show() // アラートダイアログの表示