package com.app.demo.domain.mapper;

import com.app.demo.domain.dto.PersonDTO;
import com.app.demo.persistence.entity.Person;

import java.util.Random;

public class PersonMapper {

    public static Person toEntity(PersonDTO personDTO) {
        Person person = new Person();
        person.setCedula(personDTO.getCedula());
        person.setNombre(personDTO.getNombre());
        person.setApellido(personDTO.getApellido());
        person.setId(new Random().nextLong());
        return person;
    }

    public static PersonDTO toDto(Person person) {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setCedula(person.getCedula());
        personDTO.setNombre(person.getNombre());
        personDTO.setApellido(person.getApellido());
        return personDTO;
    }
}
