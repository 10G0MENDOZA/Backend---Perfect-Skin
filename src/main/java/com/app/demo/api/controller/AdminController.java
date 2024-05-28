package com.app.demo.api.controller;
import com.app.demo.domain.dto.AdminDTO;
import com.app.demo.domain.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/admin")

public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping(value = "/login")
    public boolean login(@RequestBody AdminDTO adminDTO) {
        String username = adminDTO.getUsername();
        String password = adminDTO.getPassword();

        System.out.println("username: " + username);
        System.out.println("password: " + password);
        return adminService.findUserByNameAndPassword(username, password);
    }

}
