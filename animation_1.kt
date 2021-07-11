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
    val alphaFadeOut = AlphaAnimation(1.0f, 0.0f)
    alphaFadeOut.duration = 1500 // 動作している時間
    alphaFadeOut.fillAfter = true // 動作後そのまま
    ID名.startAnimation(alphaFadeOut) // アニメーションスタート
}, 500) // 開始時間(〇〇秒後)

// パート2
android.os.Handler().postDelayed( Runnable {
    val alphaFadeIn = AlphaAnimation(0.0f, 1.0f)
    alphaFadeIn.setDuration(800)
    alphaFadeIn.setFillAfter(true)
    ID名.startAnimation(alphaFadeIn)
}, 100)



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
val objectAnimator = ObjectAnimator.ofFloat(topSeeThroughTouch, “rotation”, 2500f)
objectAnimator.duration = 10000
objectAnimator.repeatCount = -1
objectAnimator.start()



// 移動アニメーション (いろいろな方向へ使える)

// 例
CommonMethods.deplayProcess(800) { // アニメーション開始時間
    val moveDistance = Point(
        childView.width - 130,
        0 - (childView.height - 80)
    )

    val animX = ObjectAnimator.ofFloat(
        childView,
        "translateX",
        moveDistance.x.toFloat()
    )
    animX.duration = 500 // X軸の移動スピード
    animX.start()

    val animY = ObjectAnimator.ofFloat(
        childView,
        "translateY",
        moveDistance.y.toFloat()
    )
    animY.duration = 500 // Y軸の移動スピード
    animY.start()
}