// 【アニメーション】


// 左から右へ移動
Handler().postDelayed( {
    val translate = TranslateAnimation(0f, 690f, 0f, 0f) // X軸のスタート, X軸の終着点, Y軸のスタート, Y軸の終着点
        translate.setDuration(1500) // 動作している時間
        translate.setFillAfter(true) // 移動後、そのまま表示
        topSeeThroughHand.startAnimation(translate) // アニメーションスタート
}, 2000) // 開始時間(〇〇秒後)