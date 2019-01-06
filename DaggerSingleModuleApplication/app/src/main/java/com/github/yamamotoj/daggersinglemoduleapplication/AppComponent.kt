package com.github.yamamotoj.daggersinglemoduleapplication

import dagger.Component

@Component
interface AppComponent{
    fun inject(mainActivity: MainActivity)
}