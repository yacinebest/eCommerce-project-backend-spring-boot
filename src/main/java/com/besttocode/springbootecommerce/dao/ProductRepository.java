package com.besttocode.springbootecommerce.dao;

import com.besttocode.springbootecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin({"http://localhost:4200","http://localhost:80",
            "http://ecommerce-angular-frontend","http://ecommerce-angular-frontend:4200","http://ecommerce-angular-frontend:80"})
public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByCategoryId(@RequestParam("id") Long id, Pageable page);
    Page<Product> findByNameContaining(@RequestParam("name") String name, Pageable page);
}
