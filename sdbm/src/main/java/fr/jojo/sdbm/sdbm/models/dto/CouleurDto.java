package fr.jojo.sdbm.sdbm.models.dto;

import fr.jojo.sdbm.sdbm.models.entities.Couleur;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Couleur}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CouleurDto implements Serializable {
    private Integer id;
    private String nomCouleur;
}