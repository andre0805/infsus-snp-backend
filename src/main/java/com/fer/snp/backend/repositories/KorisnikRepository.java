package com.fer.snp.backend.repositories;

import com.fer.snp.backend.entities.Korisnik;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@Transactional
public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {
    Optional<Korisnik> findKorisnikById(Long id);
    Optional<Korisnik> findKorisnikByEmail(String email);

    boolean existsById(Long id);
    boolean existsByEmail(String email);
}
