package com.littlebill.webapp.service;

import com.littlebill.webapp.model.User;
import com.littlebill.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository _userRepository;

    public User GetUserAuth(){
        return _userRepository.GetUserAuth();
    }
}
