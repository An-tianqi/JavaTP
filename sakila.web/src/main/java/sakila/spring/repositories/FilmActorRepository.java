package sakila.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sakila.spring.entities.FilmActor;

public interface FilmActorRepository extends JpaRepository<FilmActor,Long> {
}
