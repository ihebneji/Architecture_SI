package tn.esprit.tppprojet2627.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tableProjet")
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode @Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class Projet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String nom;
    @OneToOne(cascade = CascadeType.ALL)
    ProjetDetail projetDetail;
    @ManyToMany(mappedBy = "Projet")
    Set<Equipe> equipes = new HashSet<>();


}
