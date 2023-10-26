package com.example.ignoredtests.model

enum class Operator {
    ADICAO,
    SUBTRACAO,
    MULTIPLICACAO,
    DIVISAO;

    companion object {
        fun getType(operator: String): Operator? = when (operator) {
            "+" -> ADICAO
            "-" -> SUBTRACAO
            "*" -> MULTIPLICACAO
            "/" -> DIVISAO
            else -> null
        }
    }

}