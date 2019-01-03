package com.github.yamamotoj.multimoduleapp2

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.yamamotoj.module1.package24.Foo02499
import com.github.yamamotoj.module2.package49.Foo04999
import com.github.yamamotoj.module3.package74.Foo07499
import com.github.yamamotoj.module4.package99.Foo09999

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Foo02499().method5()
        Foo04999().method5()
        Foo07499().method5()
        Foo09999().method5()
    }
}
