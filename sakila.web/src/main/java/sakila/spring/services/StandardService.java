package sakila.spring.services;

import java.util.List;


public interface StandardService<T,K> {
    T create(T entity);
    T read(K id);
    T update(T entity);
    void delete(K id);
    List<T> readAll();
}
