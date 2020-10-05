// Main_Activityファイルの決まり文句的なもの
package com.example.singleviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


// valuesフォルダーのstringファイルでテキストなどを変更できる(例)
<resources>
    <string name="app_name">Single View Application</string>
    <string name="win_text">Win!</string>
    <string name="lose_text">Lose!</string>
    <string name="draw_text">Draw!</string>
    <string name="gu">グー</string>
    <string name="choki">チョキ</string>
    <string name="per">パー</string>
    <string name="open">Open</string>
</resources>