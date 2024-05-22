package com.fer.snp.backend.entities;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Ustanova {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String naziv;
    private String adresa;
    private String telefonskiBroj;

    public Ustanova(String naziv, String adresa, String telefonskiBroj) {
        this.naziv = naziv;
        this.adresa = adresa;
        this.telefonskiBroj = telefonskiBroj;
    }
}
