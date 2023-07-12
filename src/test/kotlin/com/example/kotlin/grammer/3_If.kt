package com.example.kotlin.grammer


fun main() {
    val job = "Software Developer"

    if (job == "Software Developer") {
        println("개발자")
    } else {
        println("개발자 아님")
    }

    //코틀린의 if else는 표현식이다
    //자바는 구문이다

    val age: Int = 10;
    var str = if (age > 10) {
        "성인"
    } else {
        "아이"
    }

    println(str);

    //코틀린의 if문 자체가 표현식이기 때문에 삼항연산자가 없다

    val a = 1;
    val b = 2;
    val c = if (b > a) b else a;
    println(c);
}
