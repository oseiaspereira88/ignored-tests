package com.example.ignoredtests.controller

import com.example.ignoredtests.model.Operation
import com.example.ignoredtests.service.Calculator
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("calc")
class CalculatorController {

    @PostMapping(consumes = [MediaType.APPLICATION_JSON_VALUE])
    fun calculate(@RequestBody operation: Operation): ResponseEntity<String> {

        val result = Calculator.calculate(operation)
        println("$operation = $result")
        return ResponseEntity.ok(result)
    }
}