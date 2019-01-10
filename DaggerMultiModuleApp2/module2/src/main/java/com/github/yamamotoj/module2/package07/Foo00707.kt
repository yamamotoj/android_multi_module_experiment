package com.github.yamamotoj.module2.package07
import javax.inject.Inject
class Foo00707 @Inject constructor(){
    fun method0() { Foo00706().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
