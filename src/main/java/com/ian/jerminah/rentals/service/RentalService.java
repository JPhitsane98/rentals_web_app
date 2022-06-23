package com.ian.jerminah.rentals.service;

import com.ian.jerminah.rentals.domain.Rental;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Component
public interface RentalService {

  void save(Rental rental);

  void update (String email,Rental rental);

  void delete (String email);

  List<Rental> getAllRentals ();
}
