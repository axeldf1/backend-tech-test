package com.littlebill.api.service;

import com.littlebill.api.model.User;
import com.littlebill.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService{

    @Autowired
    private UserRepository _userRepository;

   public boolean CheckLogin(String password, String pseudo){
       if(_userRepository.existsById(pseudo)) {
           User user = _userRepository.findById(pseudo).get();
           return (password.equals(user.getPassword()) && pseudo.equals(user.getPseudo()));
       }
       return false;
   }

   public void CreateUser(User user){
       _userRepository.save(user);
   }
}
