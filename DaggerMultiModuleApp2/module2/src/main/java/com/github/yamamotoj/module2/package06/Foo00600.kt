package com.github.yamamotoj.module2.package06
import javax.inject.Inject
import com.github.yamamotoj.module2.package05.Foo00599
class Foo00600 @Inject constructor(){
    fun method0() { Foo00599().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
