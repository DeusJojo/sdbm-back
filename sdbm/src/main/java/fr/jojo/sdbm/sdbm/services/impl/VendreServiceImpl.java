package fr.jojo.sdbm.sdbm.services.impl;

import fr.jojo.sdbm.sdbm.models.dto.VendreDto;
import fr.jojo.sdbm.sdbm.models.dto.VenteParAnneeVolumeDto;
import fr.jojo.sdbm.sdbm.models.entities.Vendre;
import fr.jojo.sdbm.sdbm.repositories.VendreRepository;
import fr.jojo.sdbm.sdbm.services.VendreService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VendreServiceImpl implements VendreService {

    private VendreRepository vendreRepository;

    @Override
    public Optional<List<VenteParAnneeVolumeDto>> getVendreByArticleAndVolume(String nomArticle) {
        ModelMapper modelMapper = new ModelMapper();
        List<VenteParAnneeVolumeDto> vendres = vendreRepository.findSumQuantiteAndPrixVenteByNomArticleGroupByAnneeAndVolume(nomArticle);
        return Optional.of(vendres.stream().map(vendre -> modelMapper.map(vendre, VenteParAnneeVolumeDto.class)).toList());
    }
}
