import java.time.LocalDate;
import java.util.Date;

public class Sistema {
    public static void main(String[] args) {
        Order order = new Order(1080, new Date(),OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        //passando a string para enum

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);


    }
}
