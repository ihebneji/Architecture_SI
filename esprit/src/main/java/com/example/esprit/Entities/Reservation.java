package com.example.esprit.Entities;

import jakarta.persistence.*;
        import lombok.*;
        import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Reservation")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode @Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idReservation;
    @Column(name="dateDebutMaintenance")
    LocalDate dateDebut;
    @Column(name="dateFinMaintenance")
    LocalDate dateFin;
    @Enumerated(EnumType.STRING)
    StatutReservation Status;
    @ManyToOne(fetch = FetchType.LAZY)
    Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    Vehicule vehicule;

    @OneToOne(mappedBy = "reservation", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    Contrat contrat;


}
