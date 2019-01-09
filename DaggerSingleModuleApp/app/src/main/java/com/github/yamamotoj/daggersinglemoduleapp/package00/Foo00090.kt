package com.github.yamamotoj.daggersinglemoduleapp.package00
import javax.inject.Inject
class Foo00090 @Inject constructor(){
    fun method0() { Foo00089().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
