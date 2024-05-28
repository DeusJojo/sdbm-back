package fr.jojo.sdbm.sdbm.repositories;

import fr.jojo.sdbm.sdbm.models.entities.Couleur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouleurRepository extends JpaRepository<Couleur, Integer> {
}