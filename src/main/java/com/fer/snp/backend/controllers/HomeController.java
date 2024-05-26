package com.fer.snp.backend.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fer.snp.backend.entities.Korisnik;
import com.fer.snp.backend.entities.Termin;
import com.fer.snp.backend.repositories.KorisnikRepository;
import com.fer.snp.backend.repositories.PacijentRepository;
import com.fer.snp.backend.repositories.TerminRepository;
import com.fer.snp.backend.repositories.ZdravstveniDjelatnikRepository;
import com.fer.snp.backend.services.AppointmentsService;
import com.fer.snp.backend.services.IAppointmentsService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/appointments")
public class HomeController {
    private final IAppointmentsService appointmentsService;

    private final Gson gson = new Gson();

    @Autowired
    public HomeController(IAppointmentsService appointmentsService) {
        this.appointmentsService = appointmentsService;
    }

    @GetMapping("/{id}/scheduled_appointments")
    public ResponseEntity<?> getAppointments(@PathVariable("id") Long id) throws JsonProcessingException {
        List<Termin> termini = appointmentsService.getUserAppointments(id);
        return ResponseEntity.ok(termini);
    }

    @GetMapping("/{id}/available_appointments?date={date}")
    public ResponseEntity<?> getAvailableAppointments(@PathVariable("id") Long id, @RequestParam("date") String date) {
        try {
            LocalDateTime dateTime = LocalDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);
            List<Termin> termini = appointmentsService.getAvailableAppointments(id, dateTime);
            return ResponseEntity.ok(termini);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
