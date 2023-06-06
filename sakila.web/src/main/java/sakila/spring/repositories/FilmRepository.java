package sakila.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sakila.spring.entities.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
}
