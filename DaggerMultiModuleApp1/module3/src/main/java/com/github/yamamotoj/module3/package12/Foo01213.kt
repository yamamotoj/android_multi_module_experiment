package com.github.yamamotoj.module3.package12
import javax.inject.Inject
class Foo01213 @Inject constructor(){
    fun method0() { Foo01212().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
