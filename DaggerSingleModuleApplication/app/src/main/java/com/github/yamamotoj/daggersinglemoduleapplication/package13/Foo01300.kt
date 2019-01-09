package com.github.yamamotoj.daggersinglemoduleapplication.package13
import javax.inject.Inject
import com.github.yamamotoj.daggersinglemoduleapplication.package12.Foo01299
class Foo01300 @Inject constructor(){
    fun method0() { Foo01299().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
