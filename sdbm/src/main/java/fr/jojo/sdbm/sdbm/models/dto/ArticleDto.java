package fr.jojo.sdbm.sdbm.models.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO for {@link fr.jojo.sdbm.sdbm.models.entities.Article}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleDto implements Serializable {
    private Integer id;
    private String nomArticle;
    private BigDecimal prixAchat;
    private Integer volume;
    private Double titrage;
    private MarqueDto idMarque;
    private CouleurDto idCouleur;
    private TypebiereDto idType;
}