package fr.jojo.sdbm.sdbm.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VenteParAnneeVolumeDto {
    private String nomArticle;
    private Integer annee;
    private Integer volume;
    private Long totalQuantite;
    private BigDecimal totalPrixVente;
}
