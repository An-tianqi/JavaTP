package sakila.spring.controllers;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import sakila.spring.entities.Actor;
import sakila.spring.entities.Film;
import sakila.spring.services.ActorService;
import sakila.spring.services.FilmService;

import java.util.List;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/films")
public class FilmController {

    private FilmService filmService;

    private ActorService actorService;

    @GetMapping("/{id}")
    public List<Film> getByActor(@PathVariable Long id){
        Actor actor = actorService.findById(id);
        return filmService.findByActor(actor);
    }
}
