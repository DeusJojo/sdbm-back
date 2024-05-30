package fr.jojo.sdbm.sdbm.controllers;

import fr.jojo.sdbm.sdbm.models.dto.VendreDto;
import fr.jojo.sdbm.sdbm.models.dto.VenteParAnneeVolumeDto;
import fr.jojo.sdbm.sdbm.models.entities.Vendre;
import fr.jojo.sdbm.sdbm.services.VendreService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class VendreController {

    private VendreService vendreService;

    @GetMapping("/vendres/{nom}")
    public ResponseEntity<?> getVendreById(@PathVariable("nom") String nomArticle) {
        Optional<List<VenteParAnneeVolumeDto>> vendres = vendreService.getVendreByArticleAndVolume(nomArticle);
         if (vendres.isPresent()) {
             return ResponseEntity.ok(vendres.get());
         } else {
             return ResponseEntity.notFound().build();
         }
    }
}
