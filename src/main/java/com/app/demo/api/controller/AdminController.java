package com.app.demo.api.controller;
import com.app.demo.domain.dto.AdminDTO;
import com.app.demo.domain.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping(value = "/login")
    public boolean login(@RequestBody AdminDTO adminDTO) {
        return adminService.validateAdmin(adminDTO.getUsername(), adminDTO.getPassword());
    }

}
