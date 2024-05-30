package fr.jojo.sdbm.sdbm.services;

import fr.jojo.sdbm.sdbm.models.dto.VendreDto;
import fr.jojo.sdbm.sdbm.models.dto.VenteParAnneeVolumeDto;

import java.util.List;
import java.util.Optional;

public interface VendreService {
    Optional<List<VenteParAnneeVolumeDto>> getVendreByArticleAndVolume(String nomArticle);
}
