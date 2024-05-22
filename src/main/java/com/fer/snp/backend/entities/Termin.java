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
public class Termin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dateTime;
    private String status;

    @ManyToOne
    private Pacijent pacijent;

    @ManyToOne
    private ZdravstveniDjelatnik zdravstveniDjelatnik;

    public Termin(LocalDateTime dateTime, String status, Pacijent pacijent, ZdravstveniDjelatnik zdravstveniDjelatnik) {
        this.dateTime = dateTime;
        this.status = status;
        this.pacijent = pacijent;
        this.zdravstveniDjelatnik = zdravstveniDjelatnik;
    }
}
