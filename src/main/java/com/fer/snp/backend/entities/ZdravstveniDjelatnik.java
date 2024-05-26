package com.fer.snp.backend.entities;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "zdravstveni_djelatnik")
public class ZdravstveniDjelatnik extends Korisnik {
    String telefonskiBroj;

    @ManyToOne
    private Ustanova ustanova;

    @OneToMany(mappedBy = "zdravstveniDjelatnik", cascade = CascadeType.ALL)
    private List<Termin> zakazaniTermini;

    @ManyToOne
    @JoinColumn(name = "specijalizacija_id")
    private DjelatnikSpecijalizacija specijalizacija;
}
