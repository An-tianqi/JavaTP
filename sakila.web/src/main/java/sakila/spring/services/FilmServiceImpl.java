package sakila.spring.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sakila.spring.entities.Actor;
import sakila.spring.entities.Film;
import sakila.spring.entities.FilmActor;
import sakila.spring.repositories.FilmActorRepository;
import sakila.spring.repositories.FilmRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class FilmServiceImpl implements FilmService{

    private FilmActorRepository filmActorRepository;

    private FilmRepository filmRepository;

    public FilmServiceImpl(FilmActorRepository filmActorRepository, FilmRepository filmRepository) {
        this.filmActorRepository = filmActorRepository;
        this.filmRepository = filmRepository;
    }
    @Override
    public List<Film> findByActor(Actor actor){
        List<FilmActor> filmActorList = filmActorRepository.findAll();
        List<Film> filmList = new ArrayList<>();
        for(FilmActor filmActor : filmActorList){
            if(filmActor.getActorId().equals(actor.getId())){
                Optional<Film> optionalFilm = filmRepository.findById(filmActor.getFilmId());
                optionalFilm.ifPresent(filmList::add);
            }
        }
        return filmList;
    }

}
