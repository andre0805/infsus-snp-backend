package com.fer.snp.backend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class DjelatnikSpecijalizacija {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "djelatnik_id")
    private ZdravstveniDjelatnik zdravstveniDjelatnik;

    @ManyToOne
    @JoinColumn(name = "specijalizacija_id")
    private Specijalizacija specijalizacija;

    private int godina;

    public DjelatnikSpecijalizacija(ZdravstveniDjelatnik zdravstveniDjelatnik, Specijalizacija specijalizacija, int godina) {
        this.zdravstveniDjelatnik = zdravstveniDjelatnik;
        this.specijalizacija = specijalizacija;
        this.godina = godina;
    }
}
