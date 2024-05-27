package com.fer.snp.backend.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fer.snp.backend.entities.Termin;
import com.fer.snp.backend.services.IAppointmentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/appointments")
public class HomeController {
    private final IAppointmentsService appointmentsService;

    ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    public HomeController(IAppointmentsService appointmentsService) {
        this.appointmentsService = appointmentsService;
    }

    @GetMapping("/{id}/scheduled_appointments")
    public ResponseEntity<?> getAppointments(@PathVariable("id") Long id) throws JsonProcessingException {
        List<Termin> termini = appointmentsService.getUserAppointments(id);
        return ResponseEntity.ok(objectMapper.writeValueAsString(termini));
    }

    @GetMapping("/{id}/available_appointments?date={date}")
    public ResponseEntity<?> getAvailableAppointments(@PathVariable("id") Long id, @RequestParam("date") String date) {
        try {
            LocalDateTime dateTime = LocalDateTime.parse(date, DateTimeFormatter.ISO_DATE_TIME);
            List<Termin> termini = appointmentsService.getAvailableAppointments(id, dateTime);
            return ResponseEntity.ok(objectMapper.writeValueAsString(termini));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
