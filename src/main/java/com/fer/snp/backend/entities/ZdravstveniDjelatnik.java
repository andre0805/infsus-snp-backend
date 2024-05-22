package com.fer.snp.backend.entities;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class ZdravstveniDjelatnik extends Korisnik {
    String telefonskiBroj;

    @ManyToOne
    private Ustanova ustanova;

    @OneToMany
    private List<Termin> zakzaniTermini;

    @OneToMany(mappedBy = "zdravstveniDjelatnik", cascade = CascadeType.ALL)
    private Set<DjelatnikSpecijalizacija> specijalizacije = new HashSet<>();

    public ZdravstveniDjelatnik(String ime, String prezime, String email, String lozinka, String telefonskiBroj, Ustanova ustanova) {
        super(ime, prezime, email, lozinka);
        this.telefonskiBroj = telefonskiBroj;
        this.ustanova = ustanova;
    }
}
