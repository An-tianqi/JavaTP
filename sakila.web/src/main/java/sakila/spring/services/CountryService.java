package sakila.spring.services;

import org.springframework.stereotype.Service;
import sakila.spring.entities.Country;

@Service
public interface CountryService extends StandardService<Country,Long>{
}
