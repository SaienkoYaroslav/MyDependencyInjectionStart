package com.example.dependencyinjectionstart.example1

class Activity {

    lateinit var keyboard: Keyboard

    init{
        Component().inject(this)
    }

}