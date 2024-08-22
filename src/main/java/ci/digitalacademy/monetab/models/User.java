package ci.digitalacademy.monetab.models;


import jakarta.persistence.*;
import lombok.*;
import java.time.Instant;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "user")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "pseudo", unique = true, nullable = false)
    private String pseudo;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "date_creation", nullable = false)
    private Instant creationDate;

}
