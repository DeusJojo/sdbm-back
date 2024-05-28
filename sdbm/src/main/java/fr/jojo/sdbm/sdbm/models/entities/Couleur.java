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
@Table(name = "COULEUR")
public class Couleur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_COULEUR", nullable = false)
    private Integer id;

    @Column(name = "NOM_COULEUR", nullable = false, length = 25)
    private String nomCouleur;

    @OneToMany(mappedBy = "idCouleur")
    private Set<Article> articles = new LinkedHashSet<>();
}