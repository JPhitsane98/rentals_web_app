package com.ian.jerminah.rentals.repository;

import com.ian.jerminah.rentals.domain.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Integer> {


}
