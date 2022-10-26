package pe.com.clbstore.service;

import java.util.List;
import java.util.Optional;
import pe.com.clbstore.entity.DistritoEntity;

public interface DistritoService {
    //funcion para mostrar todos los datos
    List<DistritoEntity> findAll();
    //funcion para buscar por codigo
    Optional<DistritoEntity> findById(Long id);
    //funcion para registrar
    DistritoEntity add(DistritoEntity c);
    //funcion para actualizar
    DistritoEntity update(DistritoEntity c);
    //funcion para eliminar
    DistritoEntity delete(DistritoEntity c);
    //funcion para mostrar datos habilitados
    List<DistritoEntity> findAllCustom(); 
}
