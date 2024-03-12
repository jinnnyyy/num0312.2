package com.example.num0312

fun main() {
    println("연산할 수식을 입력하세요")

    var num1 = readln()!!.toDouble()

    while (true) {

        var operator = readln()!!.toString()
        var num2 = readln()!!.toDouble()

        when (operator) {
            "+" -> {
                num1 = num1 + num2
                println("${num1}")
            }
            "-" -> {
                num1 = num1 - num2
                println("${num1}")
            }
            "*" -> {
                num1 = num1 * num2
                println("${num1}")
            }
            "/" -> {
                num1 = num1 / num2
                println("${num1}")
            }
            "%" -> {
                num1 = num1 % num2
                println("${num1}")
            }
            else -> {
                println("잘못된 연산자 입니다")
                break
            }
        }
    }

}