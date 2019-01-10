package com.github.yamamotoj.module2.package09
import javax.inject.Inject
import com.github.yamamotoj.module2.package08.Foo00899
class Foo00900 @Inject constructor(){
    fun method0() { Foo00899().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
