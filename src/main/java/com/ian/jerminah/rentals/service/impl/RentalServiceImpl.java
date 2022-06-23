package com.ian.jerminah.rentals.service.impl;

import com.ian.jerminah.rentals.domain.Rental;
import com.ian.jerminah.rentals.domain.User;
import com.ian.jerminah.rentals.repository.RentalRepository;
import com.ian.jerminah.rentals.repository.UserRepository;
import com.ian.jerminah.rentals.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RentalServiceImpl implements RentalService {

  private RentalRepository rentalRepository;
  private UserRepository userRepository;

  @Autowired
  public RentalServiceImpl(RentalRepository rentalRepository, UserRepository userRepository) {
    this.rentalRepository = rentalRepository;
    this.userRepository = userRepository;
  }

  @Override
  public void save (final Rental rental) {
    rentalRepository.save(rental);
  }

  @Override
  public void update(String email, Rental rental) {
    User user = userRepository.findByEmail(email);
    Rental newRental = new Rental();

    newRental.setRentalId(rental.getRentalId());
    newRental.setDescription(rental.getDescription());
    newRental.setLocation(rental.getLocation());
    newRental.setPrice(rental.getPrice());
    newRental.setProvince(rental.getProvince());
    newRental.setLocation(rental.getLocation());
    newRental.setPictures(rental.getPictures());
    newRental.setUser(user);

    rentalRepository.save(newRental);

  }

  @Override
  public void delete(String email) {
    Rental rental = rentalRepository.getByEmail(email);
    rentalRepository.delete(rental);
  }


  @Override
  public List<Rental> getAllRentals () {
    return rentalRepository.findAll();
  }
}
