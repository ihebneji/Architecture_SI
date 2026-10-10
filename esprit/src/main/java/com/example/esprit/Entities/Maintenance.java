package com.example.esprit.Entities;

import jakarta.persistence.*;
        import lombok.*;
        import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "Maintenance")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode @Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Maintenance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idMaintenance;
    String description;
    @Column(name="dateDebutMaintenance")
    LocalDate dateDebut;
    @Column(name="dateFinMaintenance")
    LocalDate dateFin;
    @ManyToOne(fetch = FetchType.LAZY)
    Vehicule vehicule;

}