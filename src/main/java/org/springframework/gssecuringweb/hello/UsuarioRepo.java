package org.springframework.gssecuringweb.hello;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends CrudRepository<User, String> {

    Optional<User> findByUsername(String username);

}