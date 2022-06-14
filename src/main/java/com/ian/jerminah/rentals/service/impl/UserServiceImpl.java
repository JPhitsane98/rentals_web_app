package com.ian.jerminah.rentals.service.impl;

import com.ian.jerminah.rentals.domain.User;
import com.ian.jerminah.rentals.repository.UserRepository;
import com.ian.jerminah.rentals.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository a) {
    this.userRepository = a;
  }

  @Override
  public void register (final User user) {
    userRepository.save(user);
  }

  @Override
  public boolean login(String email, String password) {
    User user = userRepository.findByEmail(email);
    if(user!= null){
      if(user.getPassword().equals(password)){
        return true;
      }
    }
    return false;
  }

  @Override
  public void update (final User user) {

  }

  @Override
  public void delete (final User user) {
    userRepository.delete(user);
  }

  @Override
  public List<User> getAllUsers () {
    return userRepository.findAll();
  }
}
