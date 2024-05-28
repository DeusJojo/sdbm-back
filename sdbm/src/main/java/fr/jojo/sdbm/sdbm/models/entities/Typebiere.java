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
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TYPEBIERE")
public class Typebiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_TYPE", nullable = false)
    private Integer id;

    @Column(name = "NOM_TYPE", nullable = false, length = 25)
    private String nomType;

    @OneToMany(mappedBy = "idType")
    private Set<Article> articles = new LinkedHashSet<>();

}