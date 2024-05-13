package com.app.demo.domain.service;
import com.app.demo.persistence.entity.Admin;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    public boolean validateAdmin(String username, String password) {
        return username.equals("admin") && password.equals("admin123");
    }
}
