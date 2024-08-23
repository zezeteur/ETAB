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
public class Eleve {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "matricule", nullable = false)
    private String matricule;

}