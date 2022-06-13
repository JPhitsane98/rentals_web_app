package com.ian.jerminah.rentals.service.impl;

import com.ian.jerminah.rentals.domain.User;
import com.ian.jerminah.rentals.repository.UserRepository;
import com.ian.jerminah.rentals.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  @Override
  public void register (final User user) {
    userRepository.save(user);
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
