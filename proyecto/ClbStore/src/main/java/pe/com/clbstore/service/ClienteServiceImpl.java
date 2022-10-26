package pe.com.clbstore.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.clbstore.entity.ClienteEntity;
import pe.com.clbstore.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteRepository clienterepositorio;
    
    @Override
    public List<ClienteEntity> findAll() {
        return clienterepositorio.findAll();
    }

    @Override
    public Optional<ClienteEntity> findById(Long id) {
        return clienterepositorio.findById(id);
    }

    @Override
    public ClienteEntity add(ClienteEntity c) {
        return clienterepositorio.save(c); 
    }

    @Override
    public ClienteEntity update(ClienteEntity c) {
        ClienteEntity objcliente=clienterepositorio.getById(c.getId());
        BeanUtils.copyProperties(c, objcliente);
        return clienterepositorio.save(objcliente);
    }

    @Override
    public ClienteEntity delete(ClienteEntity c) {
        ClienteEntity objcliente=clienterepositorio.getById(c.getId());
        objcliente.setEstado(false);
        return clienterepositorio.save(objcliente);
    }

    @Override
    public List<ClienteEntity> findAllCustom() {
        return clienterepositorio.findAllCustom(); 
    }
    
}
