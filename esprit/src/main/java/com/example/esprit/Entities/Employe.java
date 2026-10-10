package com.example.esprit.Entities;
import jakarta.persistence.*;
        import lombok.*;
        import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Employe")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode @Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEmploye;
    String nom;
    String prenom;
    @Enumerated(EnumType.STRING)
    RoleEmploye role;
    @ManyToOne(fetch = FetchType.LAZY)
    Agence agence;

}
