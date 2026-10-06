package tn.esprit.tppprojet2627.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tableEquipe")
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode @Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nom;
    @Enumerated(EnumType.STRING)
    SpecialiteEquipe specialite;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    Entreprise entreprise;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    Set<Projet> projets;

    {
        projets = new HashSet<>();
    }

}
