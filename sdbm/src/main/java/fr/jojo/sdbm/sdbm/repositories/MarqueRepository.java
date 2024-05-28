package fr.jojo.sdbm.sdbm.repositories;

import fr.jojo.sdbm.sdbm.models.entities.Marque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarqueRepository extends JpaRepository<Marque, Integer> {
}