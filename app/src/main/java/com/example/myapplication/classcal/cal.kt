package com.example.myapplication.classcal

import android.annotation.SuppressLint

@SuppressLint("SuspiciousIndentation")
fun main() {

    println("단순계산기입니다")
    println("첫번째 숫자를 입력해주세요")
    var num1 = 0.0
    num1 = readLine()!!.toDouble()
    while (true) {
        println("산술 연산자를 입력해주세요")
        var mathEx = readLine()!!.toString()
        println("두번째 숫자를 입력해주세요")
        var num2 = readLine()!!.toDouble()
        val result = when (mathEx) {
            "+" -> AddOp()
            "-" -> MinOp()
            "*" -> MulOp()
            "/" -> DivOp()
            "%" -> PerOp()
            else -> {
                println("계산식 오류.")
                continue
            }
        }
        println("${num1} ${mathEx} ${num2}")
        num1 = result.operate(num1, num2)
        println("=${num1}")
    }
}



