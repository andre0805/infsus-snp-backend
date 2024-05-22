package com.fer.snp.backend.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Email {
    private String primatelj;
    private String naslov;
    private String poruka;
    private String privitak;

    public Email(String primatelj, String naslov, String poruka, String privitak) {
        this.primatelj = primatelj;
        this.naslov = naslov;
        this.poruka = poruka;
        this.privitak = privitak;
    }
}
