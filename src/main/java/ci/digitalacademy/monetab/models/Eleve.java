package ci.digitalacademy.monetab.models;


import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "eleve")
@ToString
@DiscriminatorValue(value = "eleve")
public class Eleve extends Personne{


    @Column(name = "matricule", nullable = false)
    private String matricule;

    @Column(name = "classe", nullable = false)
    private String classe;

}