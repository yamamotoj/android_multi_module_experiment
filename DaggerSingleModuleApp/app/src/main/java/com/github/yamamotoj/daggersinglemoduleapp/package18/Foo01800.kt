package com.github.yamamotoj.daggersinglemoduleapp.package18
import javax.inject.Inject
import com.github.yamamotoj.daggersinglemoduleapp.package17.Foo01799
class Foo01800 @Inject constructor(){
    fun method0() { Foo01799().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
