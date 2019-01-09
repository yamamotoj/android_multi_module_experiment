package com.github.yamamotoj.multimoduleapp1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.yamamotoj.module4.package99.Foo09999

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Foo09999().method5()
    }
}
