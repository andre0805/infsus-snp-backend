package com.fer.snp.backend.repositories;

import com.fer.snp.backend.entities.Termin;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface TerminRepository extends JpaRepository<Termin, Long> {

    @Query(
            value = "SELECT t FROM Termin t WHERE t.pacijent.id = :pacijentId",
            nativeQuery = false
    )
    List<Termin> findAllByPacijentId(Long pacijentId);

    @Query(
            value = "SELECT t FROM Termin t WHERE t.zdravstveniDjelatnik.id = :zdravstveniDjelatnikId",
            nativeQuery = false
    )
    List<Termin> findAllByZdravstveniDjelatnikId(Long zdravstveniDjelatnikId);

    @Query(
            value = "SELECT t FROM Termin t WHERE t.pacijent.id = :korisnikId OR t.zdravstveniDjelatnik.id = :korisnikId",
            nativeQuery = false
    )
    List<Termin> findAllByKorisnikId(Long korisnikId);
}
