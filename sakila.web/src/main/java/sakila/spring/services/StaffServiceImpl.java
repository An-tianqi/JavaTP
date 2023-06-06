package sakila.spring.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import sakila.spring.entities.Staff;
import sakila.spring.repositories.StaffRepository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Classe implementation des CRUD service
 */
@AllArgsConstructor
@Service
public class StaffServiceImpl implements StaffService{

    private StaffRepository staffRepository;

    @Override
    public Staff create(Staff staff) {
        /*if( staff.getFirstName() == null){
            staff.setFirstName("toto");
        }
        if( staff.getLastName() == null){
            staff.setLastName("tata");
        }
        if( staff.getAddressId() == null){
            staff.setAddressId(1l);
        }
        if( staff.getStoreId() == null){
            staff.setStoreId(1l);
        }
        if (staff.getUsername() == null){
            staff.setUsername("user");
        }*/
        return staffRepository.save(staff);
    }

    @Override
    public Staff read(Long id) {
        return staffRepository.findById(id).orElse(null);
    }

    @Override
    public Staff update(Staff staff) {
        return staffRepository.save(staff);
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Staff> readAll() {
        return staffRepository.findAll();
    }
}
