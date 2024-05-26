package com.fer.snp.backend.services;

import com.fer.snp.backend.entities.Termin;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface IAppointmentsService {
    void createAppointment(Termin termin);
    void deleteAppointment(Long id);
    void updateAppointment(Termin termin);
    Optional<Termin> getAppointment(Long id);
    List<Termin> getUserAppointments(Long userId);
    List<Termin> getAvailableAppointments(Long userId, LocalDateTime dateTime) throws Exception;
}
