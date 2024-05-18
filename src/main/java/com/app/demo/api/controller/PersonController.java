package com.app.demo.api.controller;

import com.app.demo.domain.dto.PersonDTO;
import com.app.demo.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api") // Prefijo común para todas las rutas en la API
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping(value = "/save") // Ruta para guardar una persona
    public PersonDTO save(@RequestBody PersonDTO personDTO) {
        return personService.save(personDTO);
    }

    @GetMapping(value = "/persons") // Ruta para obtener todas las personas
    public List<PersonDTO> getAllPersons() {
        return personService.getAll();
    }
}
