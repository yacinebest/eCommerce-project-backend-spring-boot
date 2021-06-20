package com.besttocode.springbootecommerce.dao;

import com.besttocode.springbootecommerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;


@CrossOrigin({"http://localhost:4200","http://localhost:80",
            "http://ecommerce-angular-frontend","http://ecommerce-angular-frontend:4200","http://ecommerce-angular-frontend:80"})
@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Long> {

    List<State> findByCountryCode(@Param("code") String code);
}