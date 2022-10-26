package pe.com.clbstore.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.clbstore.entity.DistritoEntity;
import pe.com.clbstore.service.DistritoService;

@RestController
@RequestMapping("/distrito")
public class DistritoController {
    @Autowired
    private DistritoService distritoservice;
    @GetMapping
    public List<DistritoEntity> findAll() {
        return distritoservice.findAll();
    }
    @GetMapping("/custom")
    public List<DistritoEntity> findAllCustom() {
        return distritoservice.findAll();
    }
    @GetMapping("/{id}")
       public Optional<DistritoEntity> findById(@PathVariable Long id) {
        return distritoservice.findById(id);
    }
    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity c) {
        return distritoservice.add(c);
    }
    @PutMapping("/{id}")
    public DistritoEntity update(@PathVariable Long id, @RequestBody DistritoEntity c) {
        c.setId(id);
        return distritoservice.update(c);
       }
    @DeleteMapping("/{id}")
    public DistritoEntity delete(@PathVariable Long id) {
        DistritoEntity objdistrito = new DistritoEntity();
        objdistrito.setEstado(false);
        return distritoservice.delete(DistritoEntity.builder().id(id).build());
    } 

}
