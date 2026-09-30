package com.stock_management_test.utils

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class DateTimeUtil {
    static String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now()
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
        return now.format(formatter)
    }
}
