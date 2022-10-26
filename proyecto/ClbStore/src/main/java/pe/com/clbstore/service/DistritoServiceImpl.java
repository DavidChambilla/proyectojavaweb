package pe.com.clbstore.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.clbstore.entity.DistritoEntity;
import pe.com.clbstore.repository.DistritoRepository;

@Service
public class DistritoServiceImpl implements DistritoService{
    @Autowired
    private DistritoRepository distritorepositorio;
    
    @Override
    public List<DistritoEntity> findAll() {
        return distritorepositorio.findAll();
    }

    @Override
    public Optional<DistritoEntity> findById(Long id) {
        return distritorepositorio.findById(id);
    }

    @Override
    public DistritoEntity add(DistritoEntity c) {
        return distritorepositorio.save(c); 
    }

    @Override
    public DistritoEntity update(DistritoEntity c) {
        DistritoEntity objcategoria=distritorepositorio.getById(c.getId());
        BeanUtils.copyProperties(c, objcategoria);
        return distritorepositorio.save(objcategoria);
    }

    @Override
    public DistritoEntity delete(DistritoEntity c) {
        DistritoEntity objcategoria=distritorepositorio.getById(c.getId());
        objcategoria.setEstado(false);
        return distritorepositorio.save(objcategoria);
    }

    @Override
    public List<DistritoEntity> findAllCustom() {
        return distritorepositorio.findAllCustom(); 
    }
    
}
