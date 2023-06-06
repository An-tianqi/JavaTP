package sakila.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sakila.spring.entities.Staff;


@Repository
public interface StaffRepository extends JpaRepository<Staff, Long> {
}
