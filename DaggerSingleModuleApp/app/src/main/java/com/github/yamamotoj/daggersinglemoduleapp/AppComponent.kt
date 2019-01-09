package com.github.yamamotoj.daggersinglemoduleapp

import dagger.Component

@Component
interface AppComponent{
    fun inject(mainActivity: MainActivity)
}