package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
    private int number;
    private Date date;
    private double totalValue;
    private List<Installment> installments;

    public Contract(int number, Date date, double totalValue) {
        this.number = number;
        this.date = date;
        this.totalValue = totalValue;
        this.installments = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public void addInstallment(Installment installment) {
        this.installments.add(installment);
    }

    public void removeInstallment(Installment installment) {
        this.installments.remove(installment);
    }
}
