package com.ian.jerminah.rentals.repository;

import com.ian.jerminah.rentals.domain.Rental;
import org.springframework.data.repository.Repository;
import org.springframework.stereotype.Component;

@Component
public class RentalRepository implements Repository<Rental, Integer> {


}
