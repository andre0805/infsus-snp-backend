package com.fer.snp.backend.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Objects;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "pacijent")
public class Pacijent extends Korisnik {
    private String oib;
    private int brojNedolazaka;

    //@OneToMany(mappedBy = "pacijent", cascade = CascadeType.ALL)
    //private List<Termin> zakazaniTermini;

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
