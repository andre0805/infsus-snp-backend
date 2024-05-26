package com.fer.snp.backend.repositories.mock;

import com.fer.snp.backend.entities.ZdravstveniDjelatnik;
import com.fer.snp.backend.repositories.ZdravstveniDjelatnikRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MockZdravstveniDjelatnikRepository implements ZdravstveniDjelatnikRepository {
    @Override
    public Optional<ZdravstveniDjelatnik> findZdravstveniDjelatnikById(Long id) {
        return Optional.empty();
    }

    @Override
    public Optional<ZdravstveniDjelatnik> findZdravstveniDjelatnikByEmail(String email) {
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
    public ZdravstveniDjelatnik updateImeById(String ime, Long id) {
        return null;
    }

    @Override
    public ZdravstveniDjelatnik updatePrezimeById(String prezime, Long id) {
        return null;
    }

    @Override
    public ZdravstveniDjelatnik updateEmailById(String email, Long id) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends ZdravstveniDjelatnik> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends ZdravstveniDjelatnik> List<S> saveAllAndFlush(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public void deleteAllInBatch(Iterable<ZdravstveniDjelatnik> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public ZdravstveniDjelatnik getOne(Long aLong) {
        return null;
    }

    @Override
    public ZdravstveniDjelatnik getById(Long aLong) {
        return null;
    }

    @Override
    public ZdravstveniDjelatnik getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends ZdravstveniDjelatnik> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends ZdravstveniDjelatnik> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends ZdravstveniDjelatnik> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends ZdravstveniDjelatnik> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends ZdravstveniDjelatnik> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends ZdravstveniDjelatnik> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends ZdravstveniDjelatnik, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends ZdravstveniDjelatnik> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ZdravstveniDjelatnik> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<ZdravstveniDjelatnik> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public List<ZdravstveniDjelatnik> findAll() {
        return List.of();
    }

    @Override
    public List<ZdravstveniDjelatnik> findAllById(Iterable<Long> longs) {
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
    public void delete(ZdravstveniDjelatnik entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ZdravstveniDjelatnik> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<ZdravstveniDjelatnik> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<ZdravstveniDjelatnik> findAll(Pageable pageable) {
        return null;
    }
}
