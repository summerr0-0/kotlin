package com.example.kotlin.grammer

import java.util.LinkedList

//List, Set, Map 제공
//컬렉션은 immutable : 읽기전용
//mutable : 수정이 가능한 컬렉션

fun main() {
    //immutable
    val currencyList = listOf("달러", "유로", "원")
    //추가 안됨
    //currencyList.add(달러)

    //mutable -> 수정 가능
    val mutableList = mutableListOf<String>()
    mutableList.add("달러")
    mutableList.add("유로")
    mutableList.add("원")

    //인라인 함수 apply를 이용해 list에 값 할당하기
    val mutableList2 = mutableListOf<String>().apply {
        add("달러")
        add("유로")
        add("원")
    }

    //immutable set
    val numberSet = setOf(1, 2, 3, 4)

    //mutableSet
    val mutableSet = mutableSetOf<Int>().apply {
        add(1)
        add(2)
        add(3)
        add(4)
    }

    //immutable Map
    // key to value 형식으로 넣는다
    val numberMap = mapOf("one" to 1, "tow" to 2)

    //mutable Map
    val mutableMap = mutableMapOf<String, Int>()

    mutableMap["one"] = 1
    mutableMap["two"] = 2
    mutableMap["three"] = 3

    //컬렉션 빌더를 사용해서 쉽게 생성 가능
    //apply와 뭐가 다르지
    //apply는 변경되는 리스트를 만든 후 넣는 것
    //BuildList 변경이안되는 list를 반환한다
    //mutable한 list를 만들어 add한 후 그냥 list로 반환하게 되는 것
    val numberList: List<Int> = buildList {
        add(1)
        add(1)
        add(1)
    }


    //특정한 type으로 선언 가능
    val linkedList = LinkedList<Int>().apply {
        addFirst(3)
        add(2)
        addLast(1)
    }

    val apply: ArrayList<Int> = ArrayList<Int>().apply {
        add(1)
        add(2)
        add(3)
    }

    //반복하는 법
    val iterator = apply.iterator()
    while (iterator.hasNext()) {
        println(iterator.next())
    }

    println("=========")

    //for로 반복하기

    for (a in apply) {
        println(a)
    }

    //다양한 Inline함수 제공함 (lambda같은)

    apply.forEach {
        println(it)
    }

    val lowerList = listOf("a", "b", "c")

    //map으로 형태변환해서 재할당
    val upperList = lowerList.map { it.uppercase() }

    //filter 사용하기
    val filter = upperList.filter { it == "A" || it == "C" }

    //자바는 최종 연산자가 잇어야함


    //코틀린은 최종연산자가 없어도 값을 반환함
    //여러 In line 메서드를 사용하면 계속 반환 -> 연산이 반복되기 때문에 oom이 발생할 수 있다
    //대량의 데이터를 가공할땐 (10만건 이상..)
    // 여러 연산 후 한번에 최종연산자를 뽑아내도록 asSequence() 사용하자

    val filtered = upperList
            .asSequence()
            .filter { it == "a" }
            .filter { it == "b" }
            .toList()


}


