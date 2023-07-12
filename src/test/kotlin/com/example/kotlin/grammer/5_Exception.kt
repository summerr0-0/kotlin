package com.example.kotlin.grammer

fun main() {

    //checked exception을 강제하지 않는다
    Thread.sleep(1)

    //직접 사용할 수 있다
    try {
        //exception 발생 가능
        throw Exception()
    } catch (e: Exception) {
        println("에러발생")
    } finally {
        println("finally")
    }

    //표현식으로 사용 가능
    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외 발생")
    }
    println(a)

//    fail("예외 발생")
//    println("이 메시지는 실행이 안된다")

    //b가 null일경우 exception이 떨어지고
    //Noting 이기 때문에 아래 로직이 실행되지 않음
    //null safty할 수 있다
    var b: String? = null
    var c: String = b ?: fail("b is Null");

    println(c.length)
}

//throw를 반환하면 기본적으로 Nothing이라는 타입이 반환된다
//이 메서드 이후의 로직은 실행 안됨
fun fail(message: String): Nothing {
    throw IllegalAccessException(message)
}