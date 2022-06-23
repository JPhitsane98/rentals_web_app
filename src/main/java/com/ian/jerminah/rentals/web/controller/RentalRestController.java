package com.ian.jerminah.rentals.web.controller;

import com.ian.jerminah.rentals.domain.Rental;
import com.ian.jerminah.rentals.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.core.Response;
import java.util.List;

@RestController
@RequestMapping("/api/v1/rentals")
public class RentalRestController {
    private RentalService rentalService;

    @Autowired
    public RentalRestController(RentalService rentalService) {
        this.rentalService = rentalService;
    }

    @PostMapping("/save")
    ResponseEntity<Rental> save(@RequestBody Rental rental) {
        rentalService.save(rental);
        return new ResponseEntity<>(rental, HttpStatus.OK);
    }
    @PatchMapping("update")
    ResponseEntity<Rental> update(String email, Rental rental) {
        rentalService.update(email, rental);
        return new ResponseEntity<>(rental,HttpStatus.ACCEPTED);
    }
    @DeleteMapping("delete")
    public void delete(String email) {
        rentalService.delete(email);
    }

    @GetMapping("All")
    ResponseEntity<List<Rental>> getAllRentals() {
        return new ResponseEntity<>(rentalService.getAllRentals(),HttpStatus.OK);
    }
}
