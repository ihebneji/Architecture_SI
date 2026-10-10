package com.example.esprit.Entities;
import jakarta.persistence.*;
        import lombok.*;
        import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Agence")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode @Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idAgence;
    String nom;
    String ville;
    String telephone;
    String adresse;
    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    Set<Vehicule> vehicules = new HashSet<>();

    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    Set<Employe> employes = new HashSet<>();


}
