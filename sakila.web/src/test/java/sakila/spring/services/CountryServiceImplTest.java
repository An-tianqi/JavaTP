package sakila.spring.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class CountryServiceImplTest {

    @Autowired
    CountryService countryService;
    @Test
    void create() {
    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void readAll() {
        log.info("<<<START ReadAll Test>>>");
        countryService.readAll().forEach(c->log.trace("{}",c));
        log.info("<<<END   ReadAll Test>>>");
    }
}