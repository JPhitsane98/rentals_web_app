package com.ian.jerminah.rentals.repository;

import com.ian.jerminah.rentals.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
User findByName(String name);

//@Query(value = "Select * from User where email=?1",nativeQuery = true)
User findByEmail(String email);
}
