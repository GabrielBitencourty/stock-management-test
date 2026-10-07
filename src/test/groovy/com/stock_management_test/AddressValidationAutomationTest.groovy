package com.stock_management_test

import com.stock_management_test.utils.DateTimeUtil
import groovy.util.logging.Slf4j
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@Slf4j
@SpringBootTest
class AddressValidationAutomationTest extends Specification{
    def "Validate address creation"() {
        given: "Create the payload"
        def dateTime = DateTimeUtil.getCurrentDateTime()
        log.info("Date Time: ${dateTime}")

        when:

        then:

        where:
        testValue | testCase
        "test"    | 123
    }
}
