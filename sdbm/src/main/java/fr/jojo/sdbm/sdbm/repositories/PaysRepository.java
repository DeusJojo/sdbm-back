package fr.jojo.sdbm.sdbm.repositories;

import fr.jojo.sdbm.sdbm.models.entities.Pays;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaysRepository extends JpaRepository<Pays, Integer> {
}