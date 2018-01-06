package com.company

import java.util.Scanner

object Main {
    private val scanner = Scanner(System.`in`)

    @JvmStatic
    fun main(args: Array<String>) {
        val myInt = getNumbers(5)
        println("the average is " + getAverage(myInt))
    }

    private fun getAverage(myInt: IntArray): Double {
        var sum = 0
        for (i in myInt.indices) {
            sum += myInt[i]
        }
        return (sum / myInt.size).toDouble()

    }

    private fun getNumbers(number: Int): IntArray {

        println("Enter the $number numbers")
        val values = IntArray(number)

        for (i in values.indices) {

            values[i] = scanner.nextInt()
            for (j in values.indices) {
                println("Value at " + j + " is " + values[j])
            }
        }
        return values
    }
}
