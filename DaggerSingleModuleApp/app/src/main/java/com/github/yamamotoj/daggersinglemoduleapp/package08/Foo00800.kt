package com.github.yamamotoj.daggersinglemoduleapp.package08
import javax.inject.Inject
import com.github.yamamotoj.daggersinglemoduleapp.package07.Foo00799
class Foo00800 @Inject constructor(){
    fun method0() { Foo00799().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
