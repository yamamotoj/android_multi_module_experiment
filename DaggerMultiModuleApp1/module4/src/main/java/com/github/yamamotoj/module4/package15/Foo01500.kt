package com.github.yamamotoj.module4.package15
import com.github.yamamotoj.module3.package14.Foo01499
import com.github.yamamotoj.module3.package14.Foo01499_Factory
import javax.inject.Inject
class Foo01500 @Inject constructor(){
    fun method0() { Foo01499().method5() }
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
