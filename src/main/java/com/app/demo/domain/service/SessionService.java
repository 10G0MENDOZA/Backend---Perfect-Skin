package com.app.demo.domain.service;

import com.app.demo.domain.dto.PersonDTO;
import com.app.demo.domain.dto.SessionRequest;
import com.app.demo.domain.mapper.PersonMapper;
import com.app.demo.persistence.entity.Users;
//import com.app.demo.persistence.repository.PersonRepository;
import com.app.demo.persistence.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SessionService {
    @Autowired
    private SessionRepository sessionRepository;

    public Boolean validateUser(SessionRequest sessionRequest){
        Users user = sessionRepository.findByNameAndPassword(sessionRequest.getName(), sessionRequest.getPassword());
        return user != null;
    }
}
