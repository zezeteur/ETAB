package ci.digitalacademy.monetab.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "professeur")
public class Professeur {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "matiere", nullable = false)
    private String matiere;


}
