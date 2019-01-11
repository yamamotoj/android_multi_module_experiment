package com.github.yamamotoj.daggermultimoduleapp1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.yamamotoj.module4.package19.Foo01999
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    val component: MainComponent = DaggerMainComponent.builder().build()
    @Inject
    lateinit var foo01999: Foo01999

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        component.inject(this)
        setContentView(R.layout.activity_main)
        foo01999.method5()
    }
}
