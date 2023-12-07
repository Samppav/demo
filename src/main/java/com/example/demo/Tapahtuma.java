package com.example.demo;

import java.io.Serializable;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Tapahtuma")
public class Tapahtuma implements Serializable{

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name = "id")
  private Long id;
  @Column(name = "nimi")
  private String name;


  public Tapahtuma(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format(
        "Tapahtuma[id=%d, name='%s']",
        id, name);
  }

  public Long getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}