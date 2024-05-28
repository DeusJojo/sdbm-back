package fr.jojo.sdbm.sdbm.models.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CONTINENT")
public class Continent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CONTINENT", nullable = false)
    private Integer id;

    @Column(name = "NOM_CONTINENT", nullable = false, length = 25)
    private String nomContinent;

    @OneToMany(mappedBy = "idContinent")
    private Set<Pays> pays = new LinkedHashSet<>();
}