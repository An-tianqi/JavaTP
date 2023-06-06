package sakila.spring.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "film")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "film_id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

}
