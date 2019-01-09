package com.github.yamamotoj.daggersinglemoduleapplication.package15
import javax.inject.Inject
import com.github.yamamotoj.daggersinglemoduleapplication.package14.Foo01499
class Foo01500 @Inject constructor(){
    fun method0() { Foo01499().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
