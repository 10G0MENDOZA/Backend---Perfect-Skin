package com.app.demo.domain.service;
import com.app.demo.persistence.entity.Admin;
import com.app.demo.persistence.entity.Users;
import com.app.demo.persistence.repository.AdministradorRepository;
import com.app.demo.persistence.repository.IAdministrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AdminService implements AdministradorRepository {

    @Autowired
    IAdministrador repository;
    /*
    public boolean validateAdmin(String username, String password) {
        return username.equals("admin") && password.equals("admin123");
    }*/

    @Override
    public Boolean findUserByNameAndPassword(String name, String password) {
        return !Objects.isNull( repository.findUsersByNameAndPassword(name, password));
    }
}
