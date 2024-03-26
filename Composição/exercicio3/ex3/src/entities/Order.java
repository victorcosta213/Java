package entities;

import entities.enuns.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;
    private List<OrderItem> items= new ArrayList<>();


    public Order() {
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem item){
        this.items.add(item);
    }

    public void removeItem(OrderItem item){
        this.items.remove(item);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: "+ sdf.format(this.moment));
        sb.append("Order Status: "+ OrderStatus.PROCESSING);
        sb.append("Client: "+this.items.get(0).getC1().getName()+" - "+this.items.get(0).getC1().getEmail());
        sb.append("Order Items: \n");

        return sb.toString();
    }
}
