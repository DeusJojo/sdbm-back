package fr.jojo.sdbm.sdbm.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TICKET")
public class Ticket {
    @EmbeddedId
    private TicketId id;

    @Column(name = "DATE_VENTE", nullable = false)
    private LocalDate dateVente;

    @Column(name = "HEURE_VENTE", nullable = false)
    private LocalTime heureVente;

}