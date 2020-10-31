package br.com.w3store.erp.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("product")
public class ProductResource {
    
    private final ProductRepository repository;

    @Autowired
    public ProductResource(ProductRepository repository) {
        this.repository = repository;
    }

    // @GetMapping
    // public Page<Product> findAll(Pageable pageable){
    //     return repository.findAll(pageable);
    // }

    @GetMapping
    public List<Product> findAll(){
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public Product save(@RequestBody Product product) {
        return this.repository.save(product);
    }

}
