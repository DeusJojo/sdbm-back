package fr.jojo.sdbm.sdbm.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "VENDRE")
public class Vendre {
    @EmbeddedId
    private VendreId id;

    @MapsId("idArticle")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ARTICLE", nullable = false)
    private Article idArticle;

    @Column(name = "QUANTITE")
    private Integer quantite;

    @Column(name = "PRIX_VENTE", precision = 19, scale = 4)
    private BigDecimal prixVente;

}