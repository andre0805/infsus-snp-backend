package com.fer.snp.backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "djelatnik_specijalizacija")
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
}
