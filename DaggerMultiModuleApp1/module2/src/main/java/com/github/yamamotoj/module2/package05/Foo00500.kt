package com.github.yamamotoj.module2.package05
import com.github.yamamotoj.module1.package04.Foo00499
import javax.inject.Inject
class Foo00500 @Inject constructor(){
    fun method0() { Foo00499().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
