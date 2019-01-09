package com.github.yamamotoj.daggersinglemoduleapp.package12
import javax.inject.Inject
class Foo01252 @Inject constructor(){
    fun method0() { Foo01251().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
