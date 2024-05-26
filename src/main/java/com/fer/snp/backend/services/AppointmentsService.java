package com.fer.snp.backend.services;

import com.fer.snp.backend.entities.Termin;
import com.fer.snp.backend.repositories.KorisnikRepository;
import com.fer.snp.backend.repositories.TerminRepository;

public class AppointmentsService {
    private final TerminRepository terminRepository;
    private final KorisnikRepository korisnikRepository;

    public AppointmentsService(TerminRepository terminRepository, KorisnikRepository korisnikRepository) {
        this.terminRepository = terminRepository;
        this.korisnikRepository = korisnikRepository;
    }

    public void createAppointment() {
        // create appointment
    }

    public void deleteAppointment() {
        // delete appointment
    }

    public void updateAppointment() {
        // update appointment
    }

    public void getAppointment(Long id) {
    }
}
