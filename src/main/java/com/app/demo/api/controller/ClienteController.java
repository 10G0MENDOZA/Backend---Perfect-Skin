package com.app.demo.api.controller;
import org.springframework.web.bind.annotation.PathVariable;
import com.app.demo.domain.dto.ClienteDTO;
import com.app.demo.domain.mapper.PersonMapper;
import com.app.demo.domain.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus; // Asegúrate de importar esto
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api") // Prefijo común para todas las rutas en la API
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping(value = "/save") // Ruta para guardar un cliente
    public ResponseEntity<PersonDTO> save(@RequestBody PersonDTO personDTO) {
        personService.save(PersonMapper.toEntity(personDTO));
        return new ResponseEntity<>(personDTO, HttpStatus.CREATED);
    }

    @GetMapping(value = "/citas")
    public ResponseEntity<List<PersonDTO>> getAllCitas() {
        List<PersonDTO> citas = personService.getAllCitas();
        return ResponseEntity.ok(citas);
    }

    @GetMapping(value = "/citas/{id}")
    public ResponseEntity<PersonDTO> getCitaById(@PathVariable(name = "id") Long id) {
        PersonDTO cita = personService.getCitaById(id);
        if (cita != null) {
            return ResponseEntity.ok(cita);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping(value = "/citas/{id}")
    public ResponseEntity<PersonDTO> updateCita(@PathVariable(name = "id") Long id, @RequestBody PersonDTO personDTO) {
        boolean updated = personService.update(id, personDTO);
        if (updated) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @DeleteMapping(value = "/citas/{id}")
    public ResponseEntity<Void> eliminarCita(@PathVariable Long id) {
        try {
            personService.delete(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            // Manejo de errores (puedes personalizarlo según tus necesidades)
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping(value = "/guardar") // Ruta para guardar una cita
    public ResponseEntity<PersonDTO> saveCita(@RequestBody PersonDTO personDTO) {
        // Verificar si ya existe una cita para la misma fecha y hora
        boolean citaExistente = personService.existeCita(personDTO.getFecha(), personDTO.getHora());
        if (citaExistente) {
            // Enviar una respuesta indicando que la cita no está disponible
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        } else {
            // Guardar la cita si no hay conflictos
            personService.save(PersonMapper.toEntity(personDTO));
            return new ResponseEntity<>(personDTO, HttpStatus.CREATED);
        }
    }
}