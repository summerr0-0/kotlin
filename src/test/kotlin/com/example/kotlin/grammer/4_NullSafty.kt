package com.example.kotlin.grammer

//널 가능성을 컴파일러가 미리 감지해서 NPE가능성을 줄일 수 있다

fun main() {
//    var a : String = null //컴파일 오류
//    var b: String = "aabbcc"
//    b = null // null 할당 불가능

    //안전연산자 ?로 null이 올 수 있음을 알림
    var a: String? = null
    println(a?.length) //null일 수 있는 변수는 ?를 넣어야 한다 안넣으면 컴파일에러

    val b: Int = if (a != null) a.length else 0;
    println(b)

    //엘비스 연산자 -> null인 경우 우변 리턴
    val c = a?.length ?: 0
    println(c)

    val nullableStr = getNullStr();

    val nullableStrLength = getLengthIfNotNull(nullableStr);
    println(nullableStrLength)


    //null이 아닐거라는 단언연산자
    //자주 사용하면 안된다
    val d: String? = null;
    val e = d!!.length

}

fun getNullStr(): String? = null
//엘비스 연산자로 null일경우 0반환
fun getLengthIfNotNull(str: String?) = str?.length ?: 0

