package com.example.kotlin.grammer

//기본적인 함수 선언
fun sum(a: Int, b: Int): Int {
    return a + b;
}

//표현식 스타일 : 몸통 없음
fun sum2(a: Int, b: Int): Int = a + b;

//표현식 & 반환타입 생략
//반환타입 추론 가능
fun sum3(a: Int, b: Int) = a + b;

//몸통이 있을 경우 반환타입을 넣어야 한다
fun sum4(a: Int, b: Int) {
//    return a + b; 컴파일오류
}

//반환타입이 없는 함수는 자동으로 Unit을 반환한다 (자바의 void와 비슷)
fun printSum(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}

//디폴트 파라미터
fun greeting(message: String = "안녕하세요") {
    println(message);
}

//fun main() {
//    greeting() // 인자가 없어서 디폴트 파라미터 값이 들어감
//    greeting("hi") // 인자를 넣으면 넣은 값이 동작
//}


fun log(level: String = "INFO", message: String) {
    println("[$level]$message")
}

//네임드 아규먼트
//메서드에 인자를 넣을 때 어떤 인자인지 명시 가능
fun main() {
//    log("인포 로그")
    log(message = "인포 로그")
    log(level = "DEBUG", "디버그 로그")
    log("WARN", "워닝 로그")
    log(level = "ERROR", message = "에러 로그")
}