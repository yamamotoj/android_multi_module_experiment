package com.github.yamamotoj.daggermultimoduleapp1

import dagger.Component

@Component
interface MainComponent{
    fun inject(mainActivity: MainActivity)
}
