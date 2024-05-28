package com.app.demo.domain.service;

import com.app.demo.domain.dto.PersonDTO;
import com.app.demo.domain.mapper.PersonMapper;
import com.app.demo.persistence.entity.Person;
import com.app.demo.persistence.repository.ClienteRepository;
import com.app.demo.persistence.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PersonRepository personRepository;

    public void save(Person persona) {
        clienteRepository.save(persona);
    }

    public List<PersonDTO> getAllCitas() {
        List<Person> persons = personRepository.findAll();
        return persons.stream()
                .map(PersonMapper::toDto)
                .collect(Collectors.toList());
    }

    public PersonDTO getCitaById(Long id) {
        Person person = personRepository.findById(id).orElse(null);
        if (person != null) {
            return PersonMapper.toDto(person);
        } else {
            return null;
        }
    }

    public boolean update(Long id, PersonDTO personDTO) {
        if (personRepository.existsById(id)) {
            Person person = PersonMapper.toEntity(personDTO);
            person.setId(id); // Ensure the ID is set to the existing entity ID
            personRepository.save(person);
            return true;
        } else {
            return false;
        }
    }

    public void delete(Long id) {
        personRepository.deleteById(id);

    }
    public boolean existeCita(String fecha, String hora) {
        // Buscar en la base de datos si existe una cita con la misma fecha y hora
        return personRepository.existsByFechaAndHora(fecha, hora);
    }

}
