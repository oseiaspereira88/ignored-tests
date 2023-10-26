package com.example.ignoredtests.model

import lombok.Builder
import lombok.Getter
import lombok.Setter

@Getter
@Setter
@Builder
class Operation(
    val numA: Float?,
    val numB: Float?,
    val operator: String?
) {

    override fun toString(): String{
        return numA.toString() + operator.toString() + numB.toString()
    }

    class Builder {
        private var numA: Float? = 0.0f
        private var numB: Float? = 0.0f
        private var operator: String? = null

        fun numA(numA: Float) = apply { this.numA = numA }
        fun numB(numB: Float) = apply { this.numB = numB }
        fun operator(operator: String) = apply { this.operator = operator }

        fun build() = Operation(numA, numB, operator)
    }
}