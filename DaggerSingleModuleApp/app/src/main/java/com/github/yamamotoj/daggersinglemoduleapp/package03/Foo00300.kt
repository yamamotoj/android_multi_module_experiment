package com.github.yamamotoj.daggersinglemoduleapp.package03
import javax.inject.Inject
import com.github.yamamotoj.daggersinglemoduleapp.package02.Foo00299
class Foo00300 @Inject constructor(){
    fun method0() { Foo00299().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
