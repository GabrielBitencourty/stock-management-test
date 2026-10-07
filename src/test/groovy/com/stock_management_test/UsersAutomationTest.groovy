package com.stock_management_test

import com.stock_management_test.utils.DateTimeUtil
import groovy.util.logging.Slf4j
import io.restassured.RestAssured
import io.restassured.http.ContentType
import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import spock.lang.Specification

@Slf4j
@SpringBootTest
@ActiveProfiles("dev")
class UsersAutomationTest extends Specification {

    @Value('${local.api.url}')
    String localBaseURL

    def "Create new user and validate the specs"() {
        given: "O payload do novo usuário"
        def dateTime = DateTimeUtil.getCurrentDateTime()
        log.info("Date Time: ${dateTime}")
        def payload = [
                name: userName,
                email: userEmail,
                password: userPassword
        ]

        when: "Enviamos a requisição usando a URL injetada do properties"
        def response = RestAssured.given()
                .baseUri(localBaseURL)
                .contentType(ContentType.JSON)
                .body(payload)
                .post("/users")

        then: "Validamos as especificações"
        log.info("Executando caso de teste: {}", testCase)
        response.statusCode() == 201
        response.jsonPath().getString("name") == userName

        where:
        userName       | userEmail        | userPassword  || testCase
        "Gabriel Test" | "email@test.com" | "test123"     || 123
    }
}
