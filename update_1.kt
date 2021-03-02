// 新しいバージョンがある際に、ユーザーにバージョンアップを促すダイアログを出す

// 【方法1】
if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
    val channelId = getString(R.string.default_notification_channel_id)
    val channelName = getString(R.string.default_notification_channel_name)
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        getSystemService(NotificationManager::class.java)!!.createNotificationChannel(NotificationChannel(channelId,
            channelName, NotificationManager.IMPORTANCE_LOW))
    }
}



// 【方法2】
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