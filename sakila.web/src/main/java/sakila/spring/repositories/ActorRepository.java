package sakila.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sakila.spring.entities.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor,Long> {
}
