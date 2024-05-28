package fr.jojo.sdbm.sdbm.repositories;

import fr.jojo.sdbm.sdbm.models.entities.Vendre;
import fr.jojo.sdbm.sdbm.models.entities.VendreId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendreRepository extends JpaRepository<Vendre, VendreId> {
}