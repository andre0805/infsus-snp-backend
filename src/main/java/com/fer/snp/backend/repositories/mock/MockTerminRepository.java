package com.fer.snp.backend.repositories.mock;

import com.fer.snp.backend.entities.Pacijent;
import com.fer.snp.backend.entities.Status;
import com.fer.snp.backend.entities.Termin;
import com.fer.snp.backend.entities.ZdravstveniDjelatnik;
import com.fer.snp.backend.repositories.TerminRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MockTerminRepository implements TerminRepository {

    List<Termin> termini = new LinkedList<>();

    public MockTerminRepository() {
        termini.add(
                new Termin(
                        1L,
                        LocalDateTime.of(2024, 6, 13, 12, 0),
                        "Pregled koljena",
                        new Status(),
                        new Pacijent(),
                        new ZdravstveniDjelatnik()
                )
        );
        termini.add(
                new Termin(
                        2L,
                        LocalDateTime.of(2024, 6, 14, 12, 0),
                        "Pregled ramena",
                        new Status(),
                        new Pacijent(),
                        new ZdravstveniDjelatnik()
                )
        );
        termini.add(
                new Termin(
                        3L,
                        LocalDateTime.of(2024, 6, 15, 12, 0),
                        "Pregled kuka",
                        new Status(),
                        new Pacijent(),
                        new ZdravstveniDjelatnik()
                )
        );

    }

    @Override
    public List<Termin> findAllByPacijentId(Long pacijentId) {
        return List.of();
    }

    @Override
    public List<Termin> findAllByZdravstveniDjelatnikId(Long zdravstveniDjelatnikId) {
        return List.of();
    }

    @Override
    public List<Termin> findAllByKorisnikId(Long korisnikId) {
        return List.of();
    }

    @Override
    public List<Termin> findAllByZdravstveniDjelatnikIdAndDateTimeIs(Long zdravstveniDjelatnikId, LocalDateTime dateTime) {
        return List.of();
    }

    @Override
    public List<Termin> findAllByDateTimeIs(LocalDateTime dateTime) {
        return termini.stream().filter(t -> t.getDateTime().equals(dateTime)).toList();
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Termin> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Termin> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Termin> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Termin getOne(Long aLong) {
        return null;
    }

    @Override
    public Termin getById(Long aLong) {
        return null;
    }

    @Override
    public Termin getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Termin> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Termin> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Termin> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Termin> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Termin> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Termin> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Termin, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Termin> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Termin> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Termin> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Termin> findAll() {
        return termini;
    }

    @Override
    public List<Termin> findAllById(Iterable<Long> longs) {
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
    public void delete(Termin entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Termin> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Termin> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Termin> findAll(Pageable pageable) {
        return null;
    }
}
