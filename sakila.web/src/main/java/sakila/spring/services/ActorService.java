package sakila.spring.services;

import sakila.spring.entities.Actor;

import java.util.List;

public interface ActorService {

    public List<Actor> findByNom(String nom);

    public List<Actor> findByPrenom(String prenom);

    public Actor findById(Long id);

}
