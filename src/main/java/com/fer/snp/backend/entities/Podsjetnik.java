package com.fer.snp.backend.entities;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Podsjetnik {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Termin termin;

    private String vrsta;
    private LocalDateTime dateTime;

    public Podsjetnik(Termin termin, String vrsta, LocalDateTime dateTime) {
        this.termin = termin;
        this.vrsta = vrsta;
        this.dateTime = dateTime;
    }
}
