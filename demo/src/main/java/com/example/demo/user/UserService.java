package com.example.demo.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service

public class UserService {
  private List<User>users= new ArrayList<>(Arrays.asList(
    new User("3", "ema01", "ema@gmail.com", 21, "Student"),
    new User("5", "ivan02", "ivan@gmal.com", 25, "Student")
  ));

  public List<User> getAllUsers() {
    return users;
  }

  public User getUser(String id){
    return users.stream().filter(t->t.getUserID().equals(id)).findFirst().get();
  }

  public void addUser(User user) {
    users.add(user);
  }

  public void updateUser(String id, User user) {
    for (int i = 0; i < users.size(); i++){
      User u = users.get(i);
      if (u.getUserID().equals(id)){
        users.set(i, user);
        return;
      }
    }



  }

  public void deleteUser(String id) {
    users.removeIf(t -> t.getUserID().equals((id)));
  }
}
