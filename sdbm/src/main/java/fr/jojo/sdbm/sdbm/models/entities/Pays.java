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
@Table(name = "PAYS")
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PAYS", nullable = false)
    private Integer id;

    @Column(name = "NOM_PAYS", nullable = false, length = 40)
    private String nomPays;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CONTINENT", nullable = false)
    private Continent idContinent;

    @OneToMany(mappedBy = "idPays")
    private Set<Marque> marques = new LinkedHashSet<>();

}