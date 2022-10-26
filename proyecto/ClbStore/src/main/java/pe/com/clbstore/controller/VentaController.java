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
import pe.com.clbstore.entity.VentaEntity;
import pe.com.clbstore.service.VentaService;

@RestController
@RequestMapping("/venta")
public class VentaController {
    @Autowired
    private VentaService ventaservice;
    @GetMapping
    public List<VentaEntity> findAll() {
        return ventaservice.findAll();
    }
    @GetMapping("/custom")
    public List<VentaEntity> findAllCustom() {
        return ventaservice.findAll();
    }
    @GetMapping("/{id}")
       public Optional<VentaEntity> findById(@PathVariable Long id) {
        return ventaservice.findById(id);
    }
    @PostMapping
    public VentaEntity add(@RequestBody VentaEntity c) {
        return ventaservice.add(c);
    }
    @PutMapping("/{id}")
    public VentaEntity update(@PathVariable Long id, @RequestBody VentaEntity c) {
        c.setId(id);
        return ventaservice.update(c);
       }
    @DeleteMapping("/{id}")
    public VentaEntity delete(@PathVariable Long id, @RequestBody VentaEntity c) {
        VentaEntity objventa = new VentaEntity();
        objventa.setEstado(false);
        return ventaservice.delete(VentaEntity.builder().id(id).build());
    } 

}
