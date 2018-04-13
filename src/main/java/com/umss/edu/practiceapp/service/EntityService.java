package com.umss.edu.practiceapp.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;

/**
 * @author milver
 */
public interface EntityService<T, I extends Serializable> {

    /**
     * @param modelDTO
     * @return the persisted entity
     */
    T save(T modelDTO);

    /**
     * @param pageable
     * @return list entities
     */
    Page<T> findAll(Pageable pageable);

    /**
     * @param id
     * @return entity
     */
    T findOne(I id);

    /**
     * @param id
     */
    void delete(I id);

    /**
     * @param modelDTO
     * @return modelDTO
     */
    T update(T modelDTO, I id);
}
