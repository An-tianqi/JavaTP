package sakila.spring.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sakila.spring.entities.Actor;
import sakila.spring.services.ActorService;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/actor")
public class ActorController {

    private ActorService service;

    @GetMapping("/nom/{nom}")
    public List<Actor> getByNom(@PathVariable String nom){
        log.trace("actor cherche par nom -->{}",nom);
        return service.findByNom(nom);
    }

    @GetMapping("/prenom/{prenom}")
    public List<Actor> getByPrenom(@PathVariable String prenom){
        log.trace("actor cherche par prenom -->{}",prenom);
        return service.findByPrenom(prenom);
    }

}
