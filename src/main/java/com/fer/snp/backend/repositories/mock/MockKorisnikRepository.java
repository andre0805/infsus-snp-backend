package com.fer.snp.backend.repositories.mock;

import com.fer.snp.backend.entities.Korisnik;
import com.fer.snp.backend.repositories.KorisnikRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MockKorisnikRepository implements KorisnikRepository {
    @Override
    public Optional<Korisnik> findKorisnikById(Long id) {
        return Optional.of(new Korisnik(1L, "Pero", "Perić", "pero.peric@fer.hr", "pero123"));
    }

    @Override
    public Optional<Korisnik> findKorisnikByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long id) {
        return false;
    }

    @Override
    public boolean existsByEmail(String email) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Korisnik> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Korisnik> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Korisnik> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Korisnik getOne(Long aLong) {
        return null;
    }

    @Override
    public Korisnik getById(Long aLong) {
        return null;
    }

    @Override
    public Korisnik getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Korisnik> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Korisnik> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Korisnik> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Korisnik> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Korisnik> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Korisnik> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Korisnik, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Korisnik> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Korisnik> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Korisnik> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<Korisnik> findAll() {
        return List.of();
    }

    @Override
    public List<Korisnik> findAllById(Iterable<Long> longs) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Korisnik entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Korisnik> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Korisnik> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Korisnik> findAll(Pageable pageable) {
        return null;
    }
}
