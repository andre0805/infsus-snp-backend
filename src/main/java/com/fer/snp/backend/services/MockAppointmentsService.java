package com.fer.snp.backend.services;

import com.fer.snp.backend.entities.Pacijent;
import com.fer.snp.backend.entities.Status;
import com.fer.snp.backend.entities.Termin;
import com.fer.snp.backend.entities.ZdravstveniDjelatnik;
import com.fer.snp.backend.repositories.mock.MockKorisnikRepository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MockAppointmentsService implements IAppointmentsService{
    public List<Termin> termini = new ArrayList<>();

    public MockAppointmentsService() {
        termini.add(
                new Termin(
                        1L,
                        LocalDateTime.of(2024, 6, 14, 12, 0),
                        "Pregled ramena",
                        new Status(2L, "ZAKAZAN"),
                        new Pacijent(),
                        new ZdravstveniDjelatnik()
                )
        );
    }

    public void createAppointment(Termin termin) {
        termini.add(termin);
    }

    public void deleteAppointment(Long id) {
        termini.removeIf(termin -> termin.getId().equals(id));
    }

    public void updateAppointment(Termin termin) {
        termini.removeIf(t -> t.getId().equals(termin.getId()));
        termini.add(termin);
    }

    public Optional<Termin> getAppointment(Long id) {
        return termini
                .stream()
                .filter(termin -> termin.getId().equals(id))
                .findFirst();
    }

    public List<Termin> getUserAppointments(Long userId) {
        return termini
                .stream()
                .filter(t -> t.getStatus().getNaziv().equals("ZAKAZAN"))
                .toList();
    }

    public List<Termin> getAvailableAppointments(Long userId, LocalDateTime dateTime) throws Exception {
        return termini
                .stream()
                .filter(t -> t.getDateTime().toLocalDate().equals(dateTime.toLocalDate()) && t.getStatus().getNaziv().equals("ZAKAZAN"))
                .toList();
    }
}
