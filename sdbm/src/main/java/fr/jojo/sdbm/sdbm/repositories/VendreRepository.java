package fr.jojo.sdbm.sdbm.repositories;

import fr.jojo.sdbm.sdbm.models.dto.VenteParAnneeVolumeDto;
import fr.jojo.sdbm.sdbm.models.entities.Vendre;
import fr.jojo.sdbm.sdbm.models.entities.VendreId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface VendreRepository extends JpaRepository<Vendre, VendreId> {
    @Query("SELECT new fr.jojo.sdbm.sdbm.models.dto.VenteParAnneeVolumeDto(v.idArticle.nomArticle, v.id.annee, v.idArticle.volume, SUM(v.quantite), SUM(v.prixVente)) " +
            "FROM Vendre v " +
            "WHERE v.idArticle.nomArticle = :nomArticle " +
            "GROUP BY v.id.annee, v.idArticle.volume")
    List<VenteParAnneeVolumeDto> findSumQuantiteAndPrixVenteByNomArticleGroupByAnneeAndVolume(@Param("nomArticle") String nomArticle);
}