package com.spring.integration.service;

import com.spring.database.pool.ConnectionPool;
import com.spring.integration.annotation.IT;
import com.spring.service.UserService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.DirtiesContext;

@IT
@RequiredArgsConstructor
//@DirtiesContext(classMode = DirtiesContext.ClassMode.BEFORE_EACH_TEST_METHOD)
public class UserServiceIT {

    private final UserService userService;
    private final ConnectionPool pool1;

    @Test
    void test() {
        System.out.println();
    }

    @Test
    void test2() {
        System.out.println();
    }
}
