package pe.com.clbstore.service;

import java.util.List;
import java.util.Optional;
import pe.com.clbstore.entity.CategoriaEntity;

public interface CategoriaService {
    //funcion para mostrar todos los datos
    List<CategoriaEntity> findAll();
    //funcion para buscar por codigo
    Optional<CategoriaEntity> findById(Long id);
    //funcion para registrar
    CategoriaEntity add(CategoriaEntity c);
    //funcion para actualizar
    CategoriaEntity update(CategoriaEntity c);
    //funcion para eliminar
    CategoriaEntity delete(CategoriaEntity c);
    //funcion para mostrar datos habilitados
    List<CategoriaEntity> findAllCustom(); 
}
