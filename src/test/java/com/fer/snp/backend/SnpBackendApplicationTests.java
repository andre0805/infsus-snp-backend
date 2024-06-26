package com.fer.snp.backend;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fer.snp.backend.controllers.HomeController;
import com.fer.snp.backend.entities.*;
import com.fer.snp.backend.repositories.KorisnikRepository;
import com.fer.snp.backend.repositories.PacijentRepository;
import com.fer.snp.backend.repositories.ZdravstveniDjelatnikRepository;
import com.fer.snp.backend.repositories.mock.MockKorisnikRepository;
import com.fer.snp.backend.repositories.mock.MockPacijentRepository;
import com.fer.snp.backend.repositories.mock.MockTerminRepository;
import com.fer.snp.backend.repositories.TerminRepository;
import com.fer.snp.backend.repositories.mock.MockZdravstveniDjelatnikRepository;
import com.fer.snp.backend.services.AppointmentsService;
import com.fer.snp.backend.services.IAppointmentsService;
import com.fer.snp.backend.services.MockAppointmentsService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class SnpBackendApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testKorisnikRepository() {
		Optional<Korisnik> expected = Optional.of(new Korisnik(1L, "Pero", "Perić", "pero.peric@fer.hr", "pero123"));
		Optional<Korisnik> actual = new MockKorisnikRepository().findKorisnikById(1L);

		assert(expected.equals(actual));
	}

	@Test
	void testAppointmentService() {
		IAppointmentsService appointmentsService = new MockAppointmentsService();

		appointmentsService.createAppointment(
				new Termin(
						4L,
						LocalDateTime.of(2024, 6, 14, 12, 0),
						"Pregled ramena",
						new Status(),
						new Pacijent(),
						new ZdravstveniDjelatnik()
				)
		);

		Optional<Termin> termin = appointmentsService.getAppointment(4L);

		assert(termin.isPresent());
	}

	@Test
	void testHomeController() throws JsonProcessingException {
		ObjectMapper objectMapper = new ObjectMapper();
		HomeController homeController = new HomeController(new MockAppointmentsService());

		List<Termin> expectedList = List.of(
                new Termin(
                        1L,
                        LocalDateTime.of(2024, 6, 14, 12, 0),
                        "Pregled ramena",
                        new Status(2L, "ZAKAZAN"),
                        new Pacijent(),
                        new ZdravstveniDjelatnik()
                )
        );

		String expected = objectMapper.writeValueAsString(expectedList);

		ResponseEntity<String> response = (ResponseEntity<String>) homeController.getAvailableAppointments(1L, "2024-06-14T00:00:00");
		String actual = response.getBody();

		assert(expected.equals(actual));
	}
}
