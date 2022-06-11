package com.ian.jerminah.rentals.domain;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "rentals")
public class Rental extends BaseEntity{

  private Byte[] pictures;

  private String description;

  private String province;

  private String location;

  private BigDecimal price;

  @ManyToOne
  private User user;
}
