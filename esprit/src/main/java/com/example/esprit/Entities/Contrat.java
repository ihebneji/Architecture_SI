package com.example.esprit.Entities;
import jakarta.persistence.*;
        import lombok.*;
        import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Table(name = "Contrat")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode @Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Contrat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idContrat;
    long montantTotal;
    @Column(name="dateSignature")
    LocalDate dateSignature;
    String valide;
    @OneToOne(fetch = FetchType.LAZY)
    Reservation reservation;

    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL,
            orphanRemoval = true, fetch = FetchType.LAZY)
    Set<Paiement> paiements = new HashSet<>();




}