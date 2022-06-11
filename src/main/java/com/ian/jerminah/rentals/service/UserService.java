package com.ian.jerminah.rentals.service;

import com.ian.jerminah.rentals.domain.User;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public interface UserService {

  void register (User user);

  void update (User user);

  void delete (User user);

  List<User> getAllUsers ();

}
