package com.github.yamamotoj.daggersinglemoduleapp.package09
import javax.inject.Inject
class Foo00981 @Inject constructor(){
    fun method0() { Foo00980().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}