package com.github.yamamotoj.module1.package04
import javax.inject.Inject
import com.github.yamamotoj.module1.package03.Foo00399
class Foo00400 @Inject constructor(){
    fun method0() { Foo00399().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
