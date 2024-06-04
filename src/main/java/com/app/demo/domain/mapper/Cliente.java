package com.app.demo.domain.mapper;

import com.app.demo.domain.dto.PersonDTO;
import com.app.demo.persistence.entity.Person;

public class PersonMapper {
    public static Person toEntity(PersonDTO personDTO) {
        return new Person(
                personDTO.getId(),
                personDTO.getNombre(),
                personDTO.getApellido(),
                personDTO.getCedula(),
                personDTO.getEdad(),
                personDTO.getCorreo(),
                personDTO.getFecha(),
                personDTO.getHora()
        );
    }

    public static PersonDTO toDto(Person person) {
        PersonDTO dto = new PersonDTO();
        dto.setId(person.getId());
        dto.setNombre(person.getNombre());
        dto.setApellido(person.getApellido());
        dto.setCedula(person.getCedula());
        dto.setEdad(person.getEdad());
        dto.setCorreo(person.getCorreo());
        dto.setFecha(person.getFecha());
        dto.setHora(person.getHora());
        return dto;
    }
}
