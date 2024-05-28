package fr.jojo.sdbm.sdbm.models.dto;

import fr.jojo.sdbm.sdbm.models.entities.Marque;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Marque}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MarqueDto implements Serializable {
    private Integer id;
    private String nomMarque;
}