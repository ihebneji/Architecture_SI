package com.example.esprit.Entities;

import jakarta.persistence.*;
        import lombok.*;
        import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Vehicule")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode @Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idVehicule;
    String immatriculation;
    String marque;
    String modele;
    @Enumerated(EnumType.STRING)
    CategorieVehicule categorie;
    @Enumerated(EnumType.STRING)
    StatusVehicule statusvehicule;
    BigDecimal tarifJournaliser;
    @ManyToOne(fetch = FetchType.LAZY)
    Agence agence;

    @ManyToMany(fetch = FetchType.LAZY)
    Set<Equipement> equipements = new HashSet<>();

    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    Set<Maintenance> maintenances = new HashSet<>();






}
