package fr.jojo.sdbm.sdbm.models.dto;

import fr.jojo.sdbm.sdbm.models.entities.Typebiere;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Typebiere}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TypebiereDto implements Serializable {
    private Integer id;
    private String nomType;
}