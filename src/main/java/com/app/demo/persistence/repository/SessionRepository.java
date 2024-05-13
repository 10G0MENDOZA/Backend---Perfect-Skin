package com.app.demo.persistence.repository;

import com.app.demo.persistence.entity.Person;
import com.app.demo.persistence.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<Users, Long> {
    Users findByNameAndPassword(String name, String password);
}
