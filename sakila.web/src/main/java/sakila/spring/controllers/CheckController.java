package sakila.spring.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class CheckController {
    @GetMapping("/")
    public String check(){
        return "<html>" +
                "<h1>" +
                "Server is UP !" +
                "</h1>" +
                "<ul>" +
                "<li><a href=\"countries/all\">Countries</a></li>" +
                "</ul>" +
                "<html>";
    }
}
