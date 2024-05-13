package com.app.demo.domain.service;

import com.app.demo.domain.dto.PersonDTO;
import com.app.demo.domain.mapper.PersonMapper;
import com.app.demo.persistence.entity.Person;
import com.app.demo.persistence.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public PersonDTO save(PersonDTO personDTO){
        personRepository.save(PersonMapper.toEntity(personDTO));
        return personDTO;
    }

    public List<PersonDTO> getAll(){
        return personRepository.findAll().stream().map(PersonMapper::toDto).collect(Collectors.toList());
    }
}
