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
@Table(name = "ficheNote")
public class FicheNote {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "note", nullable = false)
    private Integer note;

    @Column(name = "annee", nullable = false)
    private Integer annee;


}
