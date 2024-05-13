package com.app.demo.api.controller;

import com.app.demo.domain.common.Route;
import com.app.demo.domain.dto.PersonDTO;
import com.app.demo.domain.dto.SessionRequest;
import com.app.demo.domain.service.PersonService;
import com.app.demo.domain.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = Route.API)
public class SessionController {
    @Autowired
    private SessionService sessionServices;
    @PostMapping(value = Route.INICIO_SESSION)
    public Boolean validateUser(@RequestBody SessionRequest sessionRequest){
       return sessionServices.validateUser(sessionRequest);
    }
}
