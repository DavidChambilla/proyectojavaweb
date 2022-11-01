package pe.com.clbstore.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.clbstore.entity.CategoriaEntity;
import pe.com.clbstore.entity.RolEntity;
import pe.com.clbstore.repository.CategoriaRepository;
import pe.com.clbstore.repository.RolRepository;

@Service    
public class RolServiceImpl implements RolService{
    @Autowired
    private RolRepository RolRepository;
    
    @Override
    public List<RolEntity> findAll() {
        return RolRepository.findAll();
    }

    @Override
    public Optional<RolEntity> findById(Long id) {
        return RolRepository.findById(id);
    }

    @Override
    public RolEntity add(RolEntity c) {
        return RolRepository.save(c); 
    }

    @Override
    public RolEntity update(RolEntity c) {
        RolEntity objrol=RolRepository.getById(c.getId());
        BeanUtils.copyProperties(c, objrol);
        return RolRepository.save(objrol);
    }

    @Override
    public RolEntity delete(RolEntity c) {
        RolEntity objrol=RolRepository.getById(c.getId());
        objrol.setEstado(false);
        return RolRepository.save(objrol);
    }

    @Override
    public List<RolEntity> findAllCustom() {
        return RolRepository.findAllCustom(); 
    }
    
}
