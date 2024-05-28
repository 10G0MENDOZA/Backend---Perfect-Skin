package com.app.demo.persistence.repository;

import com.app.demo.persistence.entity.Users;
import org.springframework.stereotype.Repository;


public interface AdministradorRepository {

    Boolean findUserByNameAndPassword(String name, String password);
}
