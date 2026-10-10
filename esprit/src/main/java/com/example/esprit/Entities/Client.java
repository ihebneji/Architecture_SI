package com.example.esprit.Entities;
import jakarta.persistence.*;
        import lombok.*;
        import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Table(name = "Client")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode @Builder

@FieldDefaults(level = AccessLevel.PRIVATE)

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEmploye;
    String nom;
    String prenom;
    @Enumerated(EnumType.STRING)
    RoleEmploye role;
    @OneToMany(mappedBy = "client", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    Set<Reservation> reservations = new HashSet<>();
    @OneToOne
    Reservation reservation;


}
