package com.github.yamamotoj.multimoduleapp1

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.yamamotoj.module1.package24.Foo02499

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Foo02499().method5()
    }
}
