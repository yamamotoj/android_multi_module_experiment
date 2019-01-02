package com.github.yamamotoj.singlemoduleapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.github.yamamotoj.singlemoduleapp.package99.Foo09999

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Foo09999().method5()
    }
}
