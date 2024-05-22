package com.fer.snp.backend.repositories;

import com.fer.snp.backend.entities.Pacijent;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional
public interface PacijentRepository extends JpaRepository<Pacijent, Long> {
    Optional<Pacijent> findPacijentById(Long id);
    Optional<Pacijent> findPacijentByEmail(String email);

    boolean existsById(Long id);
    boolean existsByEmail(String email);

    @Modifying
    @Query(
            value = "UPDATE Korisnik " +
                    "SET ime = :ime " +
                    "WHERE id = :id",
            nativeQuery = true
    )
    Pacijent updateImeById(String ime, Long id);

    @Modifying
    @Query(
            value = "UPDATE Korisnik " +
                    "SET prezime = :prezime " +
                    "WHERE id = :id",
            nativeQuery = true
    )
    Pacijent updatePrezimeById(String prezime, Long id);

    @Modifying
    @Query(
            value = "UPDATE Korisnik " +
                    "SET email = :email " +
                    "WHERE id = :id",
            nativeQuery = true
    )
    Pacijent updateEmailById(String email, Long id);
}
