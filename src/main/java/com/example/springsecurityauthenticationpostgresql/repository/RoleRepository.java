package com.example.springsecurityauthenticationpostgresql.repository;

import com.example.springsecurityauthenticationpostgresql.models.ERole;
import com.example.springsecurityauthenticationpostgresql.models.Role;
//import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Qualifier("roles")
@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);

}

