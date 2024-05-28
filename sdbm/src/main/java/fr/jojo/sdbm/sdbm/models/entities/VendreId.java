package fr.jojo.sdbm.sdbm.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class VendreId implements java.io.Serializable {
    private static final long serialVersionUID = -1679050630137960865L;
    @Column(name = "ANNEE", nullable = false)
    private Integer annee;

    @Column(name = "NUMERO_TICKET", nullable = false)
    private Integer numeroTicket;

    @Column(name = "ID_ARTICLE", nullable = false)
    private Integer idArticle;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        VendreId entity = (VendreId) o;
        return Objects.equals(this.idArticle, entity.idArticle) &&
                Objects.equals(this.annee, entity.annee) &&
                Objects.equals(this.numeroTicket, entity.numeroTicket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idArticle, annee, numeroTicket);
    }

}