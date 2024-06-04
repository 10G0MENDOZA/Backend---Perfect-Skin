package com.app.demo.persistence.repository;

import com.app.demo.persistence.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    boolean existsByFechaAndHora(String fecha, String hora);
}
