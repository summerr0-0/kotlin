package com.example.kotlin.grammer

//enum 선언
enum class PaymentStatus(val label: String)
    //인터페이스 상속 가능
    : Payable {

    UNPAID("미지급") {
        //추상함수 구현
        override fun isPayable(): Boolean = true
    },
    PAID("지급완료") {
        override fun isPayable(): Boolean = false
    },
    FAILED("지급실패") {
        override fun isPayable(): Boolean = false
    },
    REFUNDED("환불") {
        override fun isPayable(): Boolean = false
    },
    ;

    //추상함수를 사용할 수 있다-> 프로퍼티에서 구현
//    abstract fun isPayable(): Boolean


}

interface Payable {
    fun isPayable(): Boolean
}

fun main() {
    if (PaymentStatus.UNPAID.isPayable()) {
        println("결제 가능 상태")
    }

    //value로 Enum 생성
    val paymentStatus = PaymentStatus.valueOf("PAID")
    println(paymentStatus.label)

    //동등성 비교
    if(paymentStatus == PaymentStatus.PAID){
        println("같다")
    }

    //상수들의 리스트 가져오기
    for( status in PaymentStatus.values()){
        println("$status :: ${status.label}")
    }

    //enum의 기본 프로퍼티
    //name : 프로퍼티의 이름
    //ordinal : 순서
    for( status in PaymentStatus.values()){
        println("${status.name} :: ${status.ordinal}")
    }
}
