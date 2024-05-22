package com.fer.snp.backend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Pacijent extends Korisnik {
    private String oib;
    private int brojNedolazaka;

    @OneToMany
    private List<Termin> zakazaniTermini;

    public Pacijent(String ime, String prezime, String email, String lozinka, String oib, int brojNedolazaka) {
        super(ime, prezime, email, lozinka);
        this.oib = oib;
        this.brojNedolazaka = brojNedolazaka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pacijent pacijent = (Pacijent) o;
        return Objects.equals(oib, pacijent.oib) && Objects.equals(brojNedolazaka, pacijent.brojNedolazaka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), oib, brojNedolazaka);
    }

    @Override
    public String toString() {
        return "Pacijent{" +
                "oib='" + oib + '\'' +
                ", brojNedolazaka='" + brojNedolazaka + '\'' +
                '}';
    }
}
