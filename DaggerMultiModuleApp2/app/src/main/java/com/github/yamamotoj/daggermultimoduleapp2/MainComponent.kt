package com.github.yamamotoj.daggermultimoduleapp2

import dagger.Component

@Component
interface MainComponent{
    fun  inject(mainActivity: MainActivity)
}