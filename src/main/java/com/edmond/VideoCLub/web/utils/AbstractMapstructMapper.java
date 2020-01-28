package com.edmond.VideoCLub.web.utils;

import com.edmond.VideoCLub.model.BaseEntity;
import com.edmond.VideoCLub.web.DTO.BaseDTO;

import java.util.Collection;
import java.util.List;

/**Abstraction for Spring Mapper
*@param <D> - Data Transfer Object
*@param <E> -  Entity
*/
public interface AbstractMapstructMapper<D extends BaseDTO, E extends BaseEntity> {

    E toEntity(D dto);

    D toDTO(E entity);

    List<E> toEntity(Collection<D> dtoList);

    List<D> toDTO(Collection<E> entityList);
}
