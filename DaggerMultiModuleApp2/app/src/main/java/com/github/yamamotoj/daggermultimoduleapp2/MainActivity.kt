package com.github.yamamotoj.daggermultimoduleapp2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.yamamotoj.module1.package04.Foo00499
import com.github.yamamotoj.module2.package09.Foo00999
import com.github.yamamotoj.module3.package14.Foo01499
import com.github.yamamotoj.module4.package19.Foo01999
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    val comonent = DaggerMainComponent.builder().build()

    @Inject
    lateinit var foo01999:Foo01999
    @Inject
    lateinit var foo01499: Foo01499
    @Inject
    lateinit var foo00999: Foo00999
    @Inject
    lateinit var foo00499: Foo00499

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        comonent.inject(this)
        setContentView(R.layout.activity_main)
        foo01999.method5()
        foo01499.method5()
        foo00999.method5()
        foo00499.method5()
    }
}
