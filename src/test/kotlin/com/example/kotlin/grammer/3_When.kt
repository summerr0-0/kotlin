package com.example.kotlin.grammer

fun main() {
    //자바 switch와 비슷한게 코틀린의 when
    //자바의 경우 표현식이 아니라 return이 안됨 (버전 오르고서 값 반환 가능해짐)

    var day = 2

    //추론이 가능할땐 else 생략 가능
    var result = when (day) {
        1 -> "월요일"
        2 -> "화요일"
        3 -> "수요일"
        4 -> "목요일"
        else -> "기타"
    }

    println(result)

    //한줄에 정의 가능하다
    when (getNumber()) {
        0, 1 -> print("0 또는 1")
        else -> print("0 또는 1 아님")
    }

}

fun getNumber() = 2