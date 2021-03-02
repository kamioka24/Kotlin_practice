// 【アニメーション】


// 左から右へ移動
Handler().postDelayed( {
    val translate = TranslateAnimation(0f, 690f, 0f, 0f) // X軸のスタート, X軸の終着点, Y軸のスタート, Y軸の終着点
        translate.duration = 1500 // 動作している時間
        translate.fillAfter = true // 移動後、そのまま表示
        ID名.startAnimation(translate) // アニメーションスタート
}, 2000) // 開始時間(〇〇秒後)



// フェードアウト(フェードイン)
Handler().postDelayed(Runnable {
    val alphaFadeOut = AlphaAnimation(1.0f, 0.0f) // 透明度1.0 -> 0.0へ (つまりフェードアウト)
    alphaFadeOut.duration = 1500 // 動作している時間
    alphaFadeOut.fillAfter = true // 動作後そのまま
    ID名.startAnimation(alphaFadeOut) // アニメーションスタート
}, 500) // 開始時間(〇〇秒後)



// 要素の回転