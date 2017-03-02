package mutil;

/**
 * Created by Synycs Solutions on 3/2/2017.
 */
public class Order {
    private int orderNo;
    private String orderName;
    private String firstName;

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo=" + orderNo +
                ", orderName='" + orderName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    }
}
