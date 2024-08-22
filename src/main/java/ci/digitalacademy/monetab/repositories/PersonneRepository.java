package ci.digitalacademy.monetab.repositories;

import ci.digitalacademy.monetab.models.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne, Long> {
}
