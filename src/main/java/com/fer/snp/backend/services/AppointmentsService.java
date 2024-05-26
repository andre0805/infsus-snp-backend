package com.fer.snp.backend.services;

import com.fer.snp.backend.entities.Termin;
import com.fer.snp.backend.repositories.KorisnikRepository;
import com.fer.snp.backend.repositories.PacijentRepository;
import com.fer.snp.backend.repositories.TerminRepository;
import com.fer.snp.backend.repositories.ZdravstveniDjelatnikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentsService implements IAppointmentsService {
    private final TerminRepository terminRepository;
    private final PacijentRepository pacijentRepository;
    private final ZdravstveniDjelatnikRepository zdravstveniDjelatnikRepository;

    public AppointmentsService(TerminRepository terminRepository, PacijentRepository pacijentRepository, ZdravstveniDjelatnikRepository zdravstveniDjelatnikRepository) {
        this.terminRepository = terminRepository;
        this.pacijentRepository = pacijentRepository;
        this.zdravstveniDjelatnikRepository = zdravstveniDjelatnikRepository;
    }

    public void createAppointment(Termin termin) {
        terminRepository.save(termin);
    }

    public void deleteAppointment(Long id) {
        terminRepository.deleteById(id);
    }

    public void updateAppointment(Termin termin) {
        terminRepository.deleteById(termin.getId());
        terminRepository.save(termin);
    }

    public Optional<Termin> getAppointment(Long id) {
        return terminRepository.findById(id);
    }

    public List<Termin> getUserAppointments(Long userId) {
        return terminRepository.findAllByKorisnikId(userId)
                .stream()
                .filter(t -> t.getDateTime().isAfter(LocalDateTime.now()) && t.getStatus().getNaziv().equals("ZAKAZAN"))
                .toList();
    }

    public List<Termin> getAvailableAppointments(Long userId, LocalDateTime dateTime) throws Exception {
        if (pacijentRepository.existsById(userId)) {
            return terminRepository.findAllByDateTimeIs(dateTime)
                    .stream()
                    .filter(t -> t.getStatus().getNaziv().equals("SLOBODAN"))
                    .toList();
        } else if (zdravstveniDjelatnikRepository.existsById(userId)) {
            return terminRepository.findAllByZdravstveniDjelatnikIdAndDateTimeIs(userId, dateTime)
                    .stream()
                    .filter(t -> t.getStatus().getNaziv().equals("SLOBODAN"))
                    .toList();
        } else {
            throw new Exception("User not found");
        }
    }
}
