package com.app.demo.persistence.repository;
import com.app.demo.persistence.entity.Person;
import com.app.demo.persistence.entity.Users;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface IACliente  extends CrudRepository<Users, Long> {

}
