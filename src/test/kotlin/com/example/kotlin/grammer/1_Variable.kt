package com.example.kotlin.grammer

//클래스가 없어도 된다
//탑레벨에 위치한 변수
var x = 5

fun main() {
    //변수 선언
    val a: Int = 1;
    //타입 생략 가능
    val b = 1

    //지연 할당을 할 땐 타입을 명시해줘야 한다
    val c: Int
    c = 3

    //val : value -> 재할당 불가능 readonly
    //var : variable -> 재할당 가능

    val d: String = "Hello"
    // d  =  "world" //val로 재할당할시 컴파일오류

    var f = 123
    //f = "hello" //다른 타입으로 선언시 컴파일오류

    x+=1
    println(x);

}