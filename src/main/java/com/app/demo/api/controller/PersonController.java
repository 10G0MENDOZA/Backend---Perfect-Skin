package com.app.demo.api.controller;
import com.app.demo.domain.common.Route;
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

    @PostMapping(value = "/{route}/" + Route.SAVE_PERSON) // Ruta para guardar una persona
    public PersonDTO save(@RequestBody PersonDTO personDTO, @PathVariable String route) {
        if (Route.API.equals(route)) { // Validar la ruta
            return personService.save(personDTO);
        } else {
            return null;
        }
    }

    @GetMapping(value = "/{route}/" + Route.SAVE_PERSON) // Ruta para obtener todas las personas
    public List<PersonDTO> getAllPersons(@PathVariable String route) {
        if (Route.API.equals(route)) { // Validar la ruta
            return personService.getAll();
        } else {
            return null;
        }
    }
}
