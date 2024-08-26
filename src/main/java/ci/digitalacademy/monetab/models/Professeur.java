package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "professeur")
@ToString
@DiscriminatorValue(value = "professeur")
public class Professeur extends Personne{

    @Column(name = "matiere", nullable = false)
    private String matiere;

    @Column(name = "vacant", nullable = false)
    private String vacant;


}
