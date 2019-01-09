package com.github.yamamotoj.daggersinglemoduleapplication.package01
import javax.inject.Inject
import com.github.yamamotoj.daggersinglemoduleapplication.package00.Foo00099
class Foo00100 @Inject constructor(){
    fun method0() { Foo00099().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
