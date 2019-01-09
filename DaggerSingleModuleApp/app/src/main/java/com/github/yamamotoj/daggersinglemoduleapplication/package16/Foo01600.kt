package com.github.yamamotoj.daggersinglemoduleapplication.package16
import javax.inject.Inject
import com.github.yamamotoj.daggersinglemoduleapplication.package15.Foo01599
class Foo01600 @Inject constructor(){
    fun method0() { Foo01599().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
