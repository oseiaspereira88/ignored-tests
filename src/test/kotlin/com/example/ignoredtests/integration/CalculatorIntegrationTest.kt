package com.example.ignoredtests.integration

import com.example.ignoredtests.model.Operation
import com.example.ignoredtests.model.Operator
import com.example.ignoredtests.`test-utils`.TestesIgnorados
import io.restassured.RestAssured
import io.restassured.RestAssured.given
import io.restassured.http.ContentType
import org.junit.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test
import org.junit.experimental.categories.Category
import org.junit.jupiter.api.BeforeEach
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.server.LocalServerPort


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CalculatorIntegrationTest {

    @LocalServerPort
    private val port = 0
    private final val CALC_PATH = "/calc"

    @BeforeEach
    fun setup() {
        RestAssured.port = port
    }

    @Test
    @Ignore
    @Category(TestesIgnorados::class)
    fun testSoma() {
        val operation = Operation.Builder()
            .numA(4.0f)
            .numB(5.0f)
            .operator("+")
            .build()

        val body = given()
            .contentType(ContentType.JSON)
            .body(operation)
            .post(CALC_PATH)
            .then()
            .statusCode(200)
            .extract().asString()

        assertEquals("9.0", body)
    }
}