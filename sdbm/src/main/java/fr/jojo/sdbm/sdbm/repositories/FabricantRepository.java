package fr.jojo.sdbm.sdbm.repositories;

import fr.jojo.sdbm.sdbm.models.entities.Fabricant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FabricantRepository extends JpaRepository<Fabricant, Integer> {
}