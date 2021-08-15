package com.littlebill.webapp.repository;

import com.littlebill.webapp.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserRepository extends CrudRepository<User, String> {
}
