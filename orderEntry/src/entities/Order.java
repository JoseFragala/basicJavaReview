package src.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import src.entities.enums.OrderStatus;

public class Order {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus orderStatus;

    private Client client;

    private List<OrderItem> orderItems = new ArrayList<>();

    public Order(){

    }

    public Order(Date moment, OrderStatus orderStatus, Client client) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;   
    }
    public void addItem(OrderItem orderItem){
        orderItems.add(orderItem);

    }
    public void removeItem(OrderItem orderItem){
        orderItems.remove(orderItem);
    }

    public Double total(){
        Double sum = 0.0;
        for (OrderItem oi : orderItems){
            sum += oi.subTotal();
        }

        return sum;
    }

    @Override 
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Order status: ");
        sb.append(orderStatus + "\n");
        sb.append("Client: ");
        sb.append (client + "\n");
        sb.append("Order items: \n");
        for (OrderItem item : orderItems) {
            sb.append(item + "\n");

        }

        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }    
}
