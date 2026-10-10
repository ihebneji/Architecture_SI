package com.example.esprit.Entities;
import jakarta.persistence.*;
        import lombok.*;
        import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Equipement")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode @Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Equipement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEquipement;
    String libelle;
    @ManyToMany(mappedBy = "equipements", fetch = FetchType.LAZY)
    Set<Vehicule> vehicules = new HashSet<>();


}
