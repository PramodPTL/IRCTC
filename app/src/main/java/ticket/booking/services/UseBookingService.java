package ticket.booking.services;

import java.io.File;
import java.io.IOException;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ticket.booking.entities.User;

public class UseBookingService {
  
  private User user;

  private List<User> userList;

  private ObjectMapper objectMapper = new ObjectMapper();

  private static final String USERS_PATH = "../localDB/user.json";

  public UseBookingService(User user) throws IOException{
    this.user = user;
    File users = new File(USERS_PATH);
    userList = objectMapper.readValue(users, new TypeReference<List<User>>() {
    });
  }
  

}
