package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;
import static jakarta.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@ToString
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "type_personne")
@Table(name = "personne")
public abstract class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_personne")
    private Long id_personne;

    @Column(name = "nom", nullable = false)
    private String nom;

    @Column(name = "prenom", nullable = false)
    private String prenom;

    @Column(name = "genre", nullable = false)
    private String genre;

    @Column(name = "age", nullable = false)
    private String age;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "telephone", nullable = false)
    private String telephone;


}
