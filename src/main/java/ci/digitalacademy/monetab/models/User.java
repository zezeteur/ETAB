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
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pseudo", unique = true, nullable = false)
    private String pseudo;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "date_creation", nullable = false)
    private Instant creationDate;

    @OneToOne
    private Adresse adresse;

}
