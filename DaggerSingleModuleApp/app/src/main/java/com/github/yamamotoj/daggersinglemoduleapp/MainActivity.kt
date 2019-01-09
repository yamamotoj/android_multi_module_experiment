package com.github.yamamotoj.daggersinglemoduleapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.github.yamamotoj.daggersinglemoduleapp.package19.Foo01999
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    val component:AppComponent = DaggerAppComponent.builder().build()

    @Inject
    lateinit var foo:Foo01999

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        component.inject(this)
        foo.method5()
    }
}
