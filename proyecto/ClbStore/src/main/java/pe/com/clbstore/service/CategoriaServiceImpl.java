package pe.com.clbstore.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.clbstore.entity.CategoriaEntity;
import pe.com.clbstore.repository.CategoriaRepository;

@Service
public class CategoriaServiceImpl implements CategoriaService{
    @Autowired
    private CategoriaRepository categoriarepositorio;
    
    @Override
    public List<CategoriaEntity> findAll() {
        return categoriarepositorio.findAll();
    }

    @Override
    public Optional<CategoriaEntity> findById(Long id) {
        return categoriarepositorio.findById(id);
    }

    @Override
    public CategoriaEntity add(CategoriaEntity c) {
        return categoriarepositorio.save(c); 
    }

    @Override
    public CategoriaEntity update(CategoriaEntity c) {
        CategoriaEntity objcategoria=categoriarepositorio.getById(c.getId());
        BeanUtils.copyProperties(c, objcategoria);
        return categoriarepositorio.save(objcategoria);
    }

    @Override
    public CategoriaEntity delete(CategoriaEntity c) {
        CategoriaEntity objcategoria=categoriarepositorio.getById(c.getId());
        objcategoria.setEstado(false);
        return categoriarepositorio.save(objcategoria);
    }

    @Override
    public List<CategoriaEntity> findAllCustom() {
        return categoriarepositorio.findAllCustom(); 
    }
    
}
