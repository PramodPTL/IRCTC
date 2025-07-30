package ticket.booking.entities;

import java.util.*;

public class User {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getHashPassword() {
    return hashPassword;
  }

  public void setHashPassword(String hashPassword) {
    this.hashPassword = hashPassword;
  }

  public List<Ticket> getTicketBooked() {
    return ticketBooked;
  }

  public void setTicketBooked(List<Ticket> ticketBooked) {
    this.ticketBooked = ticketBooked;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
  
  private String password;

  private String hashPassword;

  private List<Ticket> ticketBooked;

  private String userId;

  public User(String name, String password, String hashPassword, List<Ticket> ticketBooked, String userId) {
    this.name = name;
    this.password = password;
    this.hashPassword = hashPassword;
    this.ticketBooked = ticketBooked;
    this.userId = userId;
  }

  public User() {
  }

  public String getTicketInfo() {
    if (ticketBooked == null || ticketBooked.isEmpty()) {
      return "No tickets booked.";
    }
    StringBuilder sb = new StringBuilder();
    for (Ticket ticket : ticketBooked) {
      sb.append(ticket.toString()).append(System.lineSeparator());
    }
    return sb.toString().trim();
  }
  
  public void printTickets() {
    if (ticketBooked == null || ticketBooked.isEmpty()) {
      System.out.println("No tickets booked.");
      return;
    }
    for (Ticket ticket : ticketBooked) {
      System.out.println(ticket);
    }
  }

  
  

}
