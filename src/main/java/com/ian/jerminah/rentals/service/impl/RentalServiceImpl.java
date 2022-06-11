package com.ian.jerminah.rentals.service.impl;

import com.ian.jerminah.rentals.domain.Rental;
import com.ian.jerminah.rentals.repository.RentalRepository;
import com.ian.jerminah.rentals.service.RentalService;
import org.springframework.stereotype.Component;

import java.util.List;

public class RentalServiceImpl implements RentalService {

  private RentalRepository rentalRepository;

  @Override
  public void save (final Rental rental) {

  }

  @Override
  public void update (final Rental rental) {

  }

  @Override
  public void delete (final Rental rental) {

  }

  @Override
  public List<Rental> getAllRentals () {
    return null;
  }
}
