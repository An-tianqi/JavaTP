package sakila.spring.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
    @Table(name = "staff")
        @Setter @Getter
@NoArgsConstructor
public class Staff {
    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "staff_id", nullable = false)
    private Long id;
    @Column(name = "first_name", nullable = false)
    private String firstName ;
    @Column(name = "last_name", nullable = false)
    private String lastName ;
    private String email ;
    @Column(name = "store_id", nullable = false)
    private Long storeId;

    @Column(name = "address_id", nullable = false)
    private Long addressId;

    @Column(name = "username", nullable = false)
    private String username;

    private byte[] picture ;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Staff{");
        sb.append("id=").append(id);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", picture=...");
        sb.append('}');
        return sb.toString();
    }
}
