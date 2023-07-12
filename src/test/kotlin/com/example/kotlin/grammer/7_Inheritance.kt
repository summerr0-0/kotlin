package com.example.kotlin.grammer


//Open 이 붙어야 상속이 가능하다
open class Dog {
    open var age: Int = 0;
    open fun bark() {
        println("멍멍")
    }
}

//상속
//상속받은 프로퍼티는 자동으로 open상태임
open class Bulldog(
        //기본생성자에서 재정으 ㅣ가능
        override var age: Int = 0
) : Dog() {

    //재정의
//     override var age: Int = 0

    //재정의 막으려면 final 키워드 사용
//    final override fun bark() {
    override fun bark() {
        println("왕왕")
        //상위 클래스의 bark 접근
        super.bark()
    }

}

class ChildBulldog : Bulldog() {
    override var age: Int = 0
    override fun bark() {
        super.bark()
    }
}

//추상클래스
abstract class Developer {
    abstract var age: Int
    abstract fun code(language: String)
}

//추상클래스 상속받아서 재정의
class BackendDeveloper(override var age: Int) : Developer() {
    override fun code(language: String) {
        println("I code with $language")
    }
}


fun main() {
    val dog = Bulldog(age = 2)
    println(dog.age)
    dog.bark()

    val childDog = ChildBulldog()
    println(childDog.age)
    childDog.bark()

    val backendDeveloper = BackendDeveloper(10)
    println(backendDeveloper.age)
    backendDeveloper.code("kotlin")

}