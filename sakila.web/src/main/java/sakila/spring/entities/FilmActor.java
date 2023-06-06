package sakila.spring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "film_actor")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FilmActor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id", nullable = false)
    private Long filmId;

    @Column(name = "actor_id", nullable = false)
    private Long actorId;
    @ManyToMany
    @JoinColumn(name = "actor_id")
    private List<Actor> actors;

    @ManyToMany
    @JoinColumn(name = "film_id")
    private List<Film> films;

}
