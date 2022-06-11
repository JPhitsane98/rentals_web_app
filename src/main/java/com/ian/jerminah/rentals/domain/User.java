package com.ian.jerminah.rentals.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User extends BaseEntity{

  public static final int MIN_AGE = 18;

  private String name;

  private String surname;

  private String username;

  private String email;

  private String password;

  private String contactNumber;

  private LocalDate dob;

  @Enumerated(EnumType.STRING)
  private Gender gender;

  @Enumerated(EnumType.STRING)
  private UserType userType;

  @Transient
  private List<Rental> rentals;

  public String getFullName(){
    return name + " " + surname;
  }

  public boolean isBirthday(){
    return dob.equals(LocalDate.now());
  }

  public boolean showRental(){
    return userType.equals(UserType.RENTING);
  }

  public boolean validUser(){
    return (LocalDate.now().getYear() - dob.getYear()) > MIN_AGE;
  }

  public String strGender(){
    return gender.name();
  }

  public String strUserType(){
    return userType.name();
  }

  public String getDob () {
    return String.valueOf(dob);
  }

  public void setDob (final String dob) {
    this.dob = LocalDate.parse(dob);
  }
}
