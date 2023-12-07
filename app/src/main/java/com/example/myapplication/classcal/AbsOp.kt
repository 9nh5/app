package com.example.myapplication.classcal

abstract class AbsOp {
    abstract fun operate(num1: Double, num2: Double): Double
}
// abstract 전 (각각의 연산 클래스에 들어있는 공통적인 요소 = fun operate(num1:Int, num2: Int): Double
// 더하기 class AddOp {
//      fun operate(num1: Int, num2: Int): Double = (num1 + num2).toDouble()}
// 빼기  class MinOp {
//      fun operate(num1: Int, num2: Int): Double = (num1 - num2).toDouble()}
//곱하기 class MulOp {
//      fun operate(num1: Int, num2: Int): Double = (num1 * num2).toDouble()}
//나누기 class DivOp {
//      fun operate(num1: Int, num2: Int): Double = (num1 / num2).toDouble()}

//각 클래스에 공통으로 들어있는 요소를 하나로 묶음
//ex) 물고기는 물 속에 살고, 지느러미가 있다.
//    오징어는 물 속에 살고, 다리가 많다.

//여기서 공통적인 부분인 '물 속에 산다'로 묶음
//abstract class 쿨 속에 산다 클래스{
//    abstract fun 물 속에 산다
//    }
//
//원래 있던 물고기 클래스 변경
//class 물고기 : 물 속에 산다 클래스 {
//    override 물 속에 산다, 지느러미가 있다
//}
//원래 있던 오징어 클래스 변경
//class 오징어 : 물 속에 산다 클래스 {
//    override 물 속에 산다, 다리가 많다
//}

//abstract class 지정 후

//더하기   class AddOp : AbsOp() {
//    override fun operate(num1: Int, num2: Int): Double = (num1 + num2).toDouble() }
//빼기     class MinOp : AbsOp() {
//    override fun operate(num1: Int, num2: Int): Double = (num1 - num2).toDouble() }
//나머지도 비슷함


//fun main() {
//    println("단순계산기입니다")
//    println("첫번째 숫자를 입력해주세요")
//    var num1 = readLine()!!.toInt()   -> 숫자1 입력
//
//    println("수식을 입력해주세요")
//    var mathEx = readLine()!!.toString()  -> 연산자 입력(+,-,*,/)
//
//    println("두번째 숫자를 입력해주세요")
//    var num2 = readLine()!!.toInt()       -> 숫자2 입력
//
//    var calculator = Calculator()
//    var result = 0.0
//    if (mathEx == "+") {                                  -> 연산자를 인식. 각 기호에 맞는 클래스와 연결
//        result = calculator.mathEx(AddOp(), num1, num2)        더하기                 ->AddOp
//    } else if (mathEx == "-") {
//        result = calculator.mathEx(MinOp(), num1, num2)        빼기                   ->MinOp
//    } else if (mathEx == "*") {
//        result = calculator.mathEx(MulOp(), num1, num2)       곱하기                 ->MulOp
//    } else if (mathEx == "/") {
//        result = calculator.mathEx(DivOp(), num1, num2)       나누기                 ->DivOp
//    } else if (mathEx == "%") {
//        result = calculator.mathEx(PerOp(), num1, num2)       나머지                 ->PerOp
//    } else {
//        println("계산식 오류.")
//    }
//
//    println("${num1} ${mathEx} ${num2}")      결과 출력 전 1 + 2의 형태로 입력한 식 출력
//    println("= ${result}")                    결과 출력
//}

//class calculator                                   클래스 calculator의 형태
//연산하는메서드(추상화계산기,num1,num2)
//추상화한계산기,연산메서드(num1,num2)
//
//class Calculator {
//    fun mathEx(absOp: AbsOp, num1: Int, num2: Int): Double {
//        return absOp.operate(num1, num2)
//    }
//}