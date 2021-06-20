package com.besttocode.springbootecommerce.dao;

import com.besttocode.springbootecommerce.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin({"http://localhost:4200","http://localhost:80",
            "http://ecommerce-angular-frontend","http://ecommerce-angular-frontend:4200","http://ecommerce-angular-frontend:80"})
@RepositoryRestResource(collectionResourceRel = "countries",path = "countries")
public interface CountryRepository extends JpaRepository<Country, Long> {


}