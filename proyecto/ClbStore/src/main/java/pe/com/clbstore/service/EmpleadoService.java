package pe.com.clbstore.service;

import java.util.List;
import java.util.Optional;
import pe.com.clbstore.entity.EmpleadoEntity;

public interface EmpleadoService {
    //funcion para mostrar todos los datos
    List<EmpleadoEntity> findAll();
    //funcion para buscar por codigo
    Optional<EmpleadoEntity> findById(Long id);
    //funcion para registrar
    EmpleadoEntity add(EmpleadoEntity c);
    //funcion para actualizar
    EmpleadoEntity update(EmpleadoEntity c);
    //funcion para eliminar
    EmpleadoEntity delete(EmpleadoEntity c);
    //funcion para mostrar datos habilitados
    List<EmpleadoEntity> findAllCustom(); 
}
