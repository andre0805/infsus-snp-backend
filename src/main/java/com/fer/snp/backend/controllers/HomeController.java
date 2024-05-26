package com.fer.snp.backend.controllers;

import com.fer.snp.backend.entities.Korisnik;
import com.fer.snp.backend.entities.Termin;
import com.fer.snp.backend.repositories.KorisnikRepository;
import com.fer.snp.backend.repositories.TerminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    private final KorisnikRepository korisnikRepository;
    private final TerminRepository terminRepository;

    @Autowired
    public HomeController(KorisnikRepository korisnikRepository, TerminRepository terminRepository) {
        this.korisnikRepository = korisnikRepository;
        this.terminRepository = terminRepository;
    }

    @GetMapping("/{id}/appointments")
    public ResponseEntity<?> getAppointments(@PathVariable("id") Long id) {
        List<Termin> termini = terminRepository.findAllByKorisnikId(id)
                .stream()
                .filter(t -> t.getDateTime().isAfter(java.time.LocalDateTime.now()))
                .toList();

        return ResponseEntity.ok(termini);
    }

    @GetMapping("/available_appointments")
    public ResponseEntity<?> getAvailableAppointments() {
        Termin termini = terminRepository.findAll()
                .stream()
//                .filter(t -> t.getDateTime().isAfter(java.time.LocalDateTime.now()) && t.getPacijent() == null)
                .findFirst()
                .orElseThrow();

        return ResponseEntity.ok(termini);
    }

    @PostMapping("/schedule_appointment")
    public ResponseEntity<?> scheduleAppointment(Long userId, Long appointmentId) {
        Korisnik korisnik = korisnikRepository.findKorisnikById(userId).orElseThrow();
//        Termin termin = terminRepository.findById(appointmentId);
        return ResponseEntity.ok("");
    }
}
