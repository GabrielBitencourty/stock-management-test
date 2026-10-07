package com.stock_management_test.api

import io.restassured.RestAssured
import io.restassured.specification.RequestSpecification
import org.springframework.beans.factory.annotation.Value

abstract class BaseAPI {
    @Value('${local.api.url}')
    protected String baseUrl

    protected RequestSpecification request() {
        return RestAssured
                .given()
                .baseUri(baseUrl)
                .contentType("application/json")
                .accept("application/json")
    }
}
