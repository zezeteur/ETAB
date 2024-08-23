package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;

import static jakarta.persistence.GenerationType.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "adresse")
@ToString
public class Adresse {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "pays", nullable = false)
    private String pays;

    @Column(name = "ville", nullable = false)
    private String ville;

    @Column(name = "rue", nullable = false)
    private String rue;




}
