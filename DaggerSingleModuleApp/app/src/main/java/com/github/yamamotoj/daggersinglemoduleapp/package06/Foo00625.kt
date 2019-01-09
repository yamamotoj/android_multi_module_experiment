package com.github.yamamotoj.daggersinglemoduleapp.package06
import javax.inject.Inject
class Foo00625 @Inject constructor(){
    fun method0() { Foo00624().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
