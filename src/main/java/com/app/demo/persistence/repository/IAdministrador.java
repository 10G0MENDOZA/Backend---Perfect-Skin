package com.app.demo.persistence.repository;

import com.app.demo.persistence.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdministrador  extends CrudRepository<Users, Long> {

    Users findUsersByNameAndPassword(String name, String password);
}
