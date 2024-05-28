package com.app.demo.api.controller;
import com.app.demo.domain.service.Emailservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class Emailcontroller {

    @Autowired
    private Emailservice emailService;

    @PostMapping("cliente/save")
    public String saveCliente(@RequestBody Map<String, Object> data) {

        String to = (String) data.get("correo");
        String subject = "Confirmación de Registro";
        String content = "Hola estimado cliente: " + data.get("nombre") + ",\n\nTu registro ha sido exitoso. Detalles:\n"
                + "Apellido: " + data.get("apellido") + "\n"
                + "Edad: " + data.get("edad") + "\n"
                + "Cédula: " + data.get("cedula") + "\n"
                + "Fecha: " + data.get("fecha") + "\n"
                + "Hora: " + data.get("hora") + "\n\n"
                + "Gracias por registrarte te esperamos con ansias!";


        emailService.sendEmail(to, subject, content);

        return "Datos guardados y correo enviado con éxito";
    }
}