package com.github.yamamotoj.module1.package00
import javax.inject.Inject
class Foo00011 @Inject constructor(){
    fun method0() { Foo00010().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
