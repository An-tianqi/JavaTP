package sakila.spring.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import sakila.spring.entities.Country;
import sakila.spring.repositories.CountryRepository;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class CountryServiceImpl implements CountryService{
    private CountryRepository repository;

    public CountryServiceImpl(CountryRepository repository) {
        this.repository = repository;
    }

    @Override
    public Country create(Country entity) {
        if ( entity.getLastUpdate() == null)
            entity.setLastUpdate(LocalDateTime.now());
        return repository.save(entity);
    }

    @Override
    public Country read(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Country update(Country entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Country> readAll() {
        return  repository.findAll();
    }
}
