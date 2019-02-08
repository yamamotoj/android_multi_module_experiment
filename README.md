# android_multi_module_experiment

## Annotation processor free Android projects

Annotation processor free Android projects contain 1Activity and 10000 classes in a project.
Each class is generated as below.

```
class Foo00001 {
    fun method0() {
        Foo00000().method5()
    }

    fun method1() {
        method0()
    }

    fun method2() {
        method1()
    }

    fun method3() {
        method2()
    }

    fun method4() {
        method3()
    }

    fun method5() {
        method4()
    }
}
```

### SingleModuleApp

- Only `:app` module contains 1 Activity and 20000 classes.

### MultiModuleApp1

- `:app` moudle contains only MainActivity
- `:module1`, `:module2`, `:module3`and `:module4` contains 2500 classes by each
- Each module depends serially on next module, such as `:app` depends only on `:module4`, `:module4`depends only on `:moudle3`, and so on.

```
Dependency

:app -> :module4 -> :module3 -> :module2 -> module1
```


### MultiModuleApp2

- `:app` moudle contains only MainActivity
- `:module1`, `:module2`, `:module3`and `:module4` contains 2500 classes by each
- `:app`module depneds paralelly on `:module1`, `:module2`, `:module3` and `:module4`

```
Dependency

:app -> :module1
     -> :module2
     -> :module3
     -> :moudle4
```


## Android project with dagger

Dagger Android projects contain 1Activity and 2000 classes in a project.
Each annotated class is generated as below.

```
class Foo00000 @Inject constructor(){
    fun method0() {}
    fun method1() { method0() }
    fun method2() { method1() }
    fun method3() { method2() }
    fun method4() { method3() }
    fun method5() { method4() }
}
```

### DaggerSingleModuleApp

- Only `:app` module contains 1 Activity and 2000 annotated classes.


### DaggerMultiModuleApp1

- `:app` moudle contains only MainActivity
- `:module1`, `:module2`, `:module3`and `:module4` contains 500 annotated classes by each
- Each module depends serially on next module, such as `:app` depends only on `:module4`, `:module4`depends only on `:moudle3`, and so on.

```
Dependency

:app -> :module4 -> :module3 -> :module2 -> module1
```

### DaggerMultiModuleApp2

- `:app` moudle contains only MainActivity
- `:module1`, `:module2`, `:module3`and `:module4` contains 500 annotated classes by each
- `:app`module depneds paralelly on `:module1`, `:module2`, `:module3` and `:module4`

```
Dependency

:app -> :module1
     -> :module2
     -> :module3
     -> :moudle4
```






