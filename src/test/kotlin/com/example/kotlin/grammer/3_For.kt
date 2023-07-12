package com.example.kotlin.grammer

//자바의 for each와 비슷하다

fun main(){

    //범위연산자 .. 을 통해 간결하게 표현 가능
    //뒤에 있는 값도 포함된다
    for(i in 0 .. 3){
        println(i)
    }

    println("==========")

    //뒤에 있는 값 포함 안할려면 until 사용 한다
    for(i in 0 until 3){
        println(i)
    }

    println("==========")

    //특정 값만큼 증가시키려면 step
    //0부터 6까지 2씩 증가
    for(i in 0 .. 6 step 2){
        println(i)
    }

    println("==========")

    //특정 값만큼 감소시키려면 downTo
    for(i in 3 downTo 1){
        println(i)
    }

    println("==========")

    //전달받은 배열을 꺼낼 때
    val numbers = arrayOf(1,2,3)
    for(i in numbers){
        println(i)
    }

}