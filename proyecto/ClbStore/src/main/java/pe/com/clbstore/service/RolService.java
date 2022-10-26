package pe.com.clbstore.service;

import java.util.List;
import java.util.Optional;
import pe.com.clbstore.entity.RolEntity;


public interface RolService {
    //funcion para mostrar todos los datos
    List<RolEntity> findAll();
    //funcion para buscar por codigo
    Optional<RolEntity> findById(Long id);
    //funcion para registrar
    RolEntity add(RolEntity c);
    //funcion para actualizar
    RolEntity update(RolEntity c);
    //funcion para eliminar
    RolEntity delete(RolEntity c);
    //funcion para mostrar datos habilitados
    List<RolEntity> findAllCustom(); 
}
