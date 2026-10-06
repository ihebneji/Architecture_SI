package tn.esprit.tppprojet2627.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "tableProjetDetail")
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
@EqualsAndHashCode @Builder

@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjetDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     long id;
     String description;
     String technologie;
     long coutProvisoire;
    @Column(name="dateDebutProjet")
     LocalDate dateDebut;
    @OneToOne(mappedBy="projetDetail")
    Projet projet;

}