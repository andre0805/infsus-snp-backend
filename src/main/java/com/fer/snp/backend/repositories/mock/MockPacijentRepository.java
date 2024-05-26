package com.fer.snp.backend.repositories.mock;

import com.fer.snp.backend.entities.Pacijent;
import com.fer.snp.backend.repositories.PacijentRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MockPacijentRepository implements PacijentRepository {

    @Override
    public Optional<Pacijent> findPacijentById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<Pacijent> findPacijentByEmail(String email) {
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
    public Pacijent updateImeById(String ime, Long id) {
        return null;
    }

    @Override
    public Pacijent updatePrezimeById(String prezime, Long id) {
        return null;
    }

    @Override
    public Pacijent updateEmailById(String email, Long id) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Pacijent> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Pacijent> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<Pacijent> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Pacijent getOne(Long aLong) {
        return null;
    }

    @Override
    public Pacijent getById(Long aLong) {
        return null;
    }

    @Override
    public Pacijent getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Pacijent> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Pacijent> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends Pacijent> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends Pacijent> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Pacijent> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Pacijent> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Pacijent, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Pacijent> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Pacijent> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<Pacijent> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<Pacijent> findAll() {
        return List.of();
    }

    @Override
    public List<Pacijent> findAllById(Iterable<Long> longs) {
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
    public void delete(Pacijent entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Pacijent> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Pacijent> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<Pacijent> findAll(Pageable pageable) {
        return null;
    }
}
