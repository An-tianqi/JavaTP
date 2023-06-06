package sakila.spring.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sakila.spring.entities.Actor;
import sakila.spring.repositories.ActorRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ActorServiceImpl implements ActorService{
    private ActorRepository repository;

    public ActorServiceImpl(ActorRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Actor> findByNom(String nom) {
        List<Actor> actors1 = repository.findAll();
        List<Actor> actors2 = new ArrayList<>();
        for (Actor actor: actors1 ) {
            if( actor.getLastName().equals(nom)){
                actors2.add(actor);
            }
        }
        return actors2;
    }
    @Override
    public List<Actor> findByPrenom(String prenom) {
        List<Actor> actors1 = repository.findAll();
        List<Actor> actors2 = new ArrayList<>();
        for (Actor actor: actors1 ) {
            if( actor.getFirstName().equals(prenom)){
                actors2.add(actor);
            }
        }
        return actors2;
    }

    @Override
    public Actor findById(Long id){
        return repository.findById(id).orElse(null);
    }
}
