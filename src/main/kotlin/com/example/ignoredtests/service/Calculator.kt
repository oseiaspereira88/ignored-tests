package com.example.ignoredtests.service

import com.example.ignoredtests.model.Operation
import com.example.ignoredtests.model.Operator


class Calculator {

    companion object {
        fun calculate(operation: Operation): String? {
            return when(operation.operator?.let { Operator.getType(it) }){
                Operator.ADICAO -> somar(operation)
                Operator.SUBTRACAO -> subtrair(operation)
                Operator.MULTIPLICACAO -> muiltiplicar(operation)
                Operator.DIVISAO -> dividir(operation)
                else -> null
            }
        }

        fun somar(operation: Operation) =
            operation.numA?.plus(operation.numB!!).toString()

        fun subtrair(operation: Operation) =
            operation.numA?.minus(operation.numB!!).toString()

        fun muiltiplicar(operation: Operation) =
            operation.numA?.times(operation.numB!!).toString()

        fun dividir(operation: Operation) =
            operation.numA?.div(operation.numB!!).toString()
    }


}