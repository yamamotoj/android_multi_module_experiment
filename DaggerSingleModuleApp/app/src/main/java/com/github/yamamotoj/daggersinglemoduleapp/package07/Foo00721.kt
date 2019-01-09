package com.github.yamamotoj.daggersinglemoduleapp.package07
import javax.inject.Inject
class Foo00721 @Inject constructor(){
    fun method0() { Foo00720().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
