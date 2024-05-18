package com.app.demo.persistence.repository;

import com.app.demo.persistence.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Person, Long> {
    Person save(Person person);
    Person findByNombre(String nombre);
    Person findByCedula(String cedula);
}
