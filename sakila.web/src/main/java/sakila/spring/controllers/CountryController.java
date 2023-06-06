package sakila.spring.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import sakila.spring.entities.Country;
import sakila.spring.services.CountryService;

import java.util.List;

@RestController
    @Slf4j
        @AllArgsConstructor
            @RequestMapping("/countries")
public class CountryController {
    private CountryService service;

    @PostMapping("/create")
    public Country create(@RequestBody Country country){
        log.trace("Country create -->{}",country);
        return service.create(country);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/{id}")
    public Country getOne(@PathVariable Long id){
        return service.read(id);
    }
    @GetMapping("/all")
    public List<Country> getAll(){
        return service.readAll();
    }
}
