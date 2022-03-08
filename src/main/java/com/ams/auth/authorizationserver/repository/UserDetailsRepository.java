package com.ams.auth.authorizationserver.repository;

import java.util.Optional;

import javax.persistence.criteria.CriteriaBuilder;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ams.auth.authorizationserver.model.User;

@Repository
public interface UserDetailsRepository extends JpaRepository<User, CriteriaBuilder.In> {
    Optional<User> findByUsername(String name);
}
