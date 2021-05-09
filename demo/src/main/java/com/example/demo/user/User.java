package com.example.demo.user;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"User\"")
public @Data class User {
  @Id
  private String userID;
  private String userName;
  private String email;
  private int age;
  private String description;

  public User() {}

  public User(String userID, String userName, String email, int age, String description) {
    super();
    this.userID = userID;
    this.userName = userName;
    this.email = email;
    this.age = age;
    this.description = description;
  }

  public String getUserID() {
    return userID;
  }

  public void setUserID(String userID) {
    this.userID = userID;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
