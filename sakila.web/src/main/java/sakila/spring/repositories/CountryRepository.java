package sakila.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sakila.spring.entities.Country;


@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
}
