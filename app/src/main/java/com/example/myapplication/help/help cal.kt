package com.example.myapplication.help

fun main(args: Array<String>) {

    println("숫자를 입력해주세요.")
    var num1 = readLine()!!.toDouble()

    println("연산자를 넣어주세요(+, -, /, *)")
    val operate = readLine()!!.toString()

    println("숫자를 입력해주세요.")
    var num2 = readLine()!!.toDouble()

    val AbstractOperation : AbstractOperation = when (operate) {
        "+" -> AddOperation()

        else -> throw IllegalArgumentException("잘못된 입력입니다. 연산자만 넣어주세요.")
    }

    val calc = Calculator(AbstractOperation)
    println("정답은 ${calc.operate(1,2)}입니다.")
}
class Calculator (
    private val operation: AbstractOperation
) {
    fun operate(num1: Int, num2: Int): Double {
        return operation.operate(num1, num2)
    }
}
abstract class AbstractOperation {
    abstract fun operate(num1: Int, num2: Int): Double
}
open class AddOperation: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double {
        return (num1 + num2).toDouble()
    }
}