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


// 点滅アニメーション
ObjectAnimator.ofFloat(ImageViewなどのid, "alpha", 1.0f, 0.0f).apply {
    repeatCount = ObjectAnimator.INFINITE  // 無限に繰り返す
    repeatMode = ObjectAnimator.REVERSE  // 逆方向に繰り返す
    duration = 1000
    start()
}
ObjectAnimator.ofFloat(ImageViewなどのid, "alpha", 0.0f, 1.0f).apply {
    repeatCount = ObjectAnimator.INFINITE  // 無限に繰り返す
    repeatMode = ObjectAnimator.REVERSE  // 逆方向に繰り返す
    duration = 1000
    start()
}

// ※ View.INVISIBLE でモチーフを隠すと点滅が始まらない。xmlファイルにてandroid:alpha="0.0" にして隠すとできる



// 要素の回転