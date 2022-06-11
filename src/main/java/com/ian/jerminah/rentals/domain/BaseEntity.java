package com.ian.jerminah.rentals.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@MappedSuperclass
@ToString
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
public class BaseEntity {

  @GeneratedValue (strategy = GenerationType.IDENTITY)
  @Id
  private int id;

  @Override
  public boolean equals (Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BaseEntity that = (BaseEntity) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode () {
    return Objects.hash(id);
  }
}
