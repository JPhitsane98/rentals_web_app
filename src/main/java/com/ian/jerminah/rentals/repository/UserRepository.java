package com.ian.jerminah.rentals.repository;

import com.ian.jerminah.rentals.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
User findByName(String name);

}
