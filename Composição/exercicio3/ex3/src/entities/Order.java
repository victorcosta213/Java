package entities;

import entities.enuns.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    public static SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
    private Date moment;
    private OrderStatus status;
    private Cliente p1;


    private List<OrderItem> items= new ArrayList<>();


    public Order() {
    }

    public Order(Date moment, OrderStatus status, Cliente p1) {
        this.moment = moment;
        this.status = status;
        this.p1= p1;
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

    public Cliente getP1() {
        return p1;
    }

    public void setP1(Cliente p1) {
        this.p1 = p1;
    }

    public double total(){
        double sum = 0;
        for (OrderItem a:items) {
            sum += a.subTotal();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ORDER SUMMARY \n");
        sb.append("Order moment: "+ sdf.format(this.moment)+"\n");
        sb.append("Client: "+ this.p1.getName()+" ("+sdf1.format(this.p1.getBirthDate())+") - "+ this.p1.getEmail()+"\n");
        sb.append("Order items:"+ this.status+"\n");
        for (OrderItem i : this.items){
            sb.append(i.getP1().getName()+", Quantity: "+i.getQuantity()+", SubTotal: "+ i.subTotal()+"\n");
        }
        sb.append("Total price: R$"+total());


        return sb.toString();
    }


}
