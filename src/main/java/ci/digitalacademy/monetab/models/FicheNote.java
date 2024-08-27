package ci.digitalacademy.monetab.models;


import jakarta.persistence.*;
import lombok.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ficheNote")
@ToString
public class FicheNote {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;

    @Column(name = "note", nullable = false)
    private Integer note;

    @Column(name = "annee", nullable = false)
    private Integer annee;

    @Column(name = "creationDate", nullable = false)
    private Integer creationDate;

    @ManyToOne
    @JoinColumn(name = "professeur_id")
    private Teacher teacher;


    @Override
    public String toString() {
        return "FicheNote{" +
                "id=" + id +
                ", note=" + note +
                ", annee=" + annee +
                ", creationDate=" + creationDate +
                ", professeur=" + teacher +
                '}';
    }
}
