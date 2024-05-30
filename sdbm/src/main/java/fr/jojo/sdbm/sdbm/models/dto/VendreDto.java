package fr.jojo.sdbm.sdbm.models.dto;

import fr.jojo.sdbm.sdbm.models.entities.Vendre;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link Vendre}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendreDto implements Serializable {
    private VendreIdDto idVendre;
    private ArticleDto idArticle;
    private Integer quantite;
    private BigDecimal prixVente;
}