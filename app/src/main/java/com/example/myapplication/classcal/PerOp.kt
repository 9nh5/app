package com.example.myapplication.classcal

class PerOp : AbsOp() {
    override fun operate(num1: Double, num2: Double): Double{
        val answer=num1%num2
        return answer
    }
}
