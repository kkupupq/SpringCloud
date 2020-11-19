package com.kateh.cloud.study.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "COOL_NAME")
public class Name {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  @Column
  private Integer gender;
  @Column
  private String name;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getGender() {
    return gender;
  }

  public void setGender(Integer gender) {
    this.gender = gender;
  }

}
