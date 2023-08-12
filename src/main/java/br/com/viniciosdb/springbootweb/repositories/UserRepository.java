package br.com.viniciosdb.springbootweb.repositories;

import br.com.viniciosdb.springbootweb.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UserRepository extends JpaRepository<User, Long> { }
