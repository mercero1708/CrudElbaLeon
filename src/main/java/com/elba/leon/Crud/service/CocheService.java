package com.elba.leon.Crud.service;

import com.elba.leon.Crud.entities.Coche;

import java.util.Optional;

public interface CocheService {
    Coche save(Coche coche) ;
    Optional<Coche> getById(Long id);
    Coche update(Long id, double nuevoPrecio);
    Boolean delete(Long id);

}
