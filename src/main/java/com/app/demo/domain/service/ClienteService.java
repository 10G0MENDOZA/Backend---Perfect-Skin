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
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    public void save(Cliente cliente) {
        clienteRepository.save(persona);
    }

    public List<ClienteDTO> getAllCitas() {
        List<Cliente> cliente = clienteRepository.findAll();
        return persons.stream()
                .map(PersonMapper::toDto)
                .collect(Collectors.toList());
    }

    public ClienteDTO getCitaById(Long id) {
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        if (person != null) {
            return PersonMapper.toDto(person);
        } else {
            return null;
        }
    }

    public boolean update(Long id, ClienteDTO ClienteDTO) {
        if (clienteRepository.existsById(id)) {
            Cliente cliente = ClienteMapper.toEntity(ClienteDTO);
            cliente.setId(id); // Ensure the ID is set to the existing entity ID
            ClienteRepository.save(cliente);
            return true;
        } else {
            return false;
        }
    }

    public void delete(Long id) {
        clienteRepository.deleteById(id);

    }
    public boolean existeCita(String fecha, String hora) {
        // Buscar en la base de datos si existe una cita con la misma fecha y hora
        return clienteRepository.existsByFechaAndHora(fecha, hora);
    }

}
