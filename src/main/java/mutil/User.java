package mutil;

import java.util.List;

/**
 * Created by Synycs Solutions on 3/1/2017.
 */
public class User

{

    private Integer userId;

    private String emailId;

    private String password;
    private String firstName1;

    private String lastName;
    //private Order order;
       private List<Order> orders;
    public User() {
    }

    public User(Integer userId, String emailId, String password, String firstName1, String lastName, List<Order> orders) {
        this.userId = userId;
        this.emailId = emailId;
        this.password = password;
        this.firstName1 = firstName1;
        this.lastName = lastName;
        this.orders = orders;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName1() {
        return firstName1;
    }

    public void setFirstName1(String firstName1) {
        this.firstName1 = firstName1;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", emailId='" + emailId + '\'' +
                ", password='" + password + '\'' +
                ", firstName1='" + firstName1 + '\'' +
                ", lastName='" + lastName + '\'' +
                ", orders=" + orders +
                '}';
    }
}


