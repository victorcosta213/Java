package model.service;

public class PaypalService implements OnlinePaymentService{

    @Override
    public double paymentFee(double amount) {
        return 0;
    }

    @Override
    public double interest(double amount, int month) {
        return 0;
    }
}
