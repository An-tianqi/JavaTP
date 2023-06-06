package sakila.spring.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
    @Table(name = "country")
@Setter @Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Country {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "country_id", nullable = false)
    private Long id;
    private String country;
    @Column(name = "last_update")
    private LocalDateTime lastUpdate;


}
