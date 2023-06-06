package sakila.spring.services;

import sakila.spring.entities.Actor;
import sakila.spring.entities.Film;

import java.util.List;

public interface FilmService {

    public List<Film> findByActor(Actor actor);
}
