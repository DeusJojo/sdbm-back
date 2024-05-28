package fr.jojo.sdbm.sdbm.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "FABRICANT")
public class Fabricant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_FABRICANT", nullable = false)
    private Integer id;

    @Column(name = "NOM_FABRICANT", nullable = false, length = 40)
    private String nomFabricant;

    @OneToMany(mappedBy = "idFabricant")
    private Set<Marque> marques = new LinkedHashSet<>();

}