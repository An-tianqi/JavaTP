package sakila.spring.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
    @Slf4j
class StaffServiceImplTest {

    @Autowired
    StaffService service;

    @BeforeEach
    void setUp() {
    }

    @Test
    void create() {
    }

    @Test
    void read() {
        Long id = 1l;
        log.trace("{}",service.read(id));
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void readAll() {
        service.readAll().forEach(s->log.trace("{}",s));
    }
}