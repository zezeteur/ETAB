package ci.digitalacademy.monetab.repositories;

import ci.digitalacademy.monetab.models.Professeur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfesseurRepository extends JpaRepository<Professeur, Long> {
}
