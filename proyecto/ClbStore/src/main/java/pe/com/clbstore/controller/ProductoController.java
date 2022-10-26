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
import pe.com.clbstore.entity.ProductoEntity;
import pe.com.clbstore.service.ProductoService;

@RestController
@RequestMapping("/producto")
public class ProductoController {
    @Autowired
    private ProductoService productoservice;
    @GetMapping
    public List<ProductoEntity> findAll() {
        return productoservice.findAll();
    }
    @GetMapping("/custom")
    public List<ProductoEntity> findAllCustom() {
        return productoservice.findAll();
    }
    @GetMapping("/{id}")
       public Optional<ProductoEntity> findById(@PathVariable Long id) {
        return productoservice.findById(id);
    }
    @PostMapping
    public ProductoEntity add(@RequestBody ProductoEntity c) {
        return productoservice.add(c);
    }
    @PutMapping("/{id}")
    public ProductoEntity update(@PathVariable Long id, @RequestBody ProductoEntity c) {
        c.setId(id);
        return productoservice.update(c);
       }
    @DeleteMapping("/{id}")
    public ProductoEntity delete(@PathVariable Long id, @RequestBody ProductoEntity c) {
        ProductoEntity objproducto = new ProductoEntity();
        objproducto.setEstado(false);
        return productoservice.delete(ProductoEntity.builder().id(id).build());
    } 

}
