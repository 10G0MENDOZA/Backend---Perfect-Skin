package com.app.demo.domain.mapper;

import com.app.demo.domain.dto.AdminDTO;
import com.app.demo.persistence.entity.Admin;

public class AdminMapper {

    public static Admin toEntity(AdminDTO adminDTO) {
        Admin admin = new Admin();
        admin.setUsername(adminDTO.getUsername());
        admin.setPassword(adminDTO.getPassword());
        return admin;
    }

    public static AdminDTO toDto(Admin admin) {
        AdminDTO adminDTO = new AdminDTO();
        adminDTO.setUsername(admin.getUsername());
        adminDTO.setPassword(admin.getPassword());
        return adminDTO;
    }
}
