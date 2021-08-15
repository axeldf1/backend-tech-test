package com.littlebill.webapp.service;

import com.littlebill.webapp.model.User;
import com.littlebill.webapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository _userRepository;

    public boolean CheckLogin(String pseudo, String password){

        if(_userRepository.existsById(pseudo)){
            return _userRepository.findById(pseudo).get().getPassword().equals(password);
        }

        return false;
    }
}
