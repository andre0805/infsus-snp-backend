package com.fer.snp.backend.repositories;

import com.fer.snp.backend.entities.ZdravstveniDjelatnik;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface ZdravstveniDjelatnikRepository extends JpaRepository<ZdravstveniDjelatnik, Long> {
    Optional<ZdravstveniDjelatnik> findZdravstveniDjelatnikById(Long id);
    Optional<ZdravstveniDjelatnik> findZdravstveniDjelatnikByEmail(String email);

    boolean existsById(Long id);
    boolean existsByEmail(String email);

    @Modifying
    @Query(
            value = "UPDATE Korisnik " +
                    "SET ime = :ime " +
                    "WHERE id = :id",
            nativeQuery = true
    )
    ZdravstveniDjelatnik updateImeById(String ime, Long id);

    @Modifying
    @Query(
            value = "UPDATE Korisnik " +
                    "SET prezime = :prezime " +
                    "WHERE id = :id",
            nativeQuery = true
    )
    ZdravstveniDjelatnik updatePrezimeById(String prezime, Long id);

    @Modifying
    @Query(
            value = "UPDATE Korisnik " +
                    "SET email = :email " +
                    "WHERE id = :id",
            nativeQuery = true
    )
    ZdravstveniDjelatnik updateEmailById(String email, Long id);
}
