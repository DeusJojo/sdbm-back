package fr.jojo.sdbm.sdbm.models.dto;

import fr.jojo.sdbm.sdbm.models.entities.VendreId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link VendreId}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VendreIdDto implements Serializable {
    private Integer annee;
    private Integer numeroTicket;
    private Integer idArticle;
}