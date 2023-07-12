package com.example.kotlin.grammer


//클래스 선언
//class Coffee constructor(val name:String){}
//constructor 키워드 생략 가능
//항상 후행콤마 붙이기 (코드 가독성 위해)
//기본값 선언 가능

//tkd
class Coffee(
        /**
         * 내부적으로 게터와 세터가 있어
         * 객체의 상태를 메서드가 아닌 프로퍼티로 표현이 가능하다
         */
        var name: String = "",
        var price: Int = 0,
        var iced:Boolean = false,
) {

    val brand: String
        get() {
            return "스타벅스"
        }
    //커스텀 게터를 만들 수 있다

    var quantity: Int = 0
        set(value){
            if(value > 0){
                //field 식별자로 필드를 참조한다
                //backing field ->
                //field = quantity
                field = value
            }
        }
    //커스텀  setter만들기
}

//본문이 없는 클래스
class EmptyClass

fun main() {
    val coffee = Coffee()
    coffee.name = "아이스아메리카노"
    coffee.price = 2000

    //컴파일러가 getter setter를 만들어준다
    println("${coffee.name} 가격은 ${coffee.price}")
    println("${coffee.brand}")
    coffee.quantity = 2
    println("${coffee.quantity}")


    //객체지향적
    //객체의 상태를 프로퍼티로 표현하고 행위로 메서드를 표현한다
    //자바의 경우는 상태를 메서드로 나타내야 함 (getter)
    coffee.iced = true
    if(coffee.iced){
        println("아이스 커피")
    }
}