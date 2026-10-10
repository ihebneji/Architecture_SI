package com.example.esprit.Entities;

import jakarta.persistence.*;
        import lombok.*;
        import lombok.experimental.FieldDefaults;
import com.example.esprit.Entities.ModePaiement;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Paiement")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode @Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idPaiement;
    long montant;
    @Column(name="datePaiement")
    LocalDate datePaiement;
    @Enumerated(EnumType.STRING)
    ModePaiement modePaiement;
    @ManyToOne(fetch = FetchType.LAZY)
    Contrat contrat;


}