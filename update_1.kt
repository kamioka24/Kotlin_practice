// 新しいバージョンがある際に、ユーザーにバージョンアップを促すダイアログを出す

// 【方法1】----------------------------------------------------------------------------------------

// graidle へ ライブラリーの記述
implementation 'com.google.android.play:core:1.9.1'


// ダイアログを出したいActivityへ記述
private val versionCode = BuildConfig.VERSION_CODE // バージョンコードの取得

val appUpdateManager = AppUpdateManagerFactory.create(this) // マネージャーのインスタンスを作成

val appUpdateInfoTask = appUpdateManager.appUpdateInfo // 更新の確認に使用するインテントオブジェクトを返す

// バージョンが古ければアップデートを促すダイアログを出す。
appUpdateInfoTask.addOnSuccessListener { appUpdateInfo -> // 指定された更新の許可を確認
    if (appUpdateInfo.updateAvailability() == UpdateAvailability.UPDATE_AVAILABLE
        && appUpdateInfo.isUpdateTypeAllowed(AppUpdateType.IMMEDIATE)) {
        appUpdateManager.startUpdateFlowForResult(
            appUpdateInfo,
            AppUpdateType.IMMEDIATE,
            this,
            versionCode)
    }
}

// 不要かも
if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
    val channelId = getString(R.string.default_notification_channel_id)
    val channelName = getString(R.string.default_notification_channel_name)
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        getSystemService(NotificationManager::class.java)!!.createNotificationChannel(NotificationChannel(channelId,
            channelName, NotificationManager.IMPORTANCE_LOW))
    }
}



// 【方法2】----------------------------------------------------------------------------------------
if (versionCode <= 13) {
    AlertDialog.Builder(this)
        .setCancelable(false) // OKボタンを押さないとダイアログが消えない設定
        .setTitle("アップデートのお知らせ")
        .setIcon(R.mipmap.ic_launcher)
        .setMessage("最新のバージョンがございます。\n" + "アップデートしてからご利用下さい。")
        .setPositiveButton("OK", { dialog, which ->
            val intent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://play.google.com/store/apps/details?id=" + packageName)
            )
            startActivity(intent)
            context.finish()
        })
        .show()