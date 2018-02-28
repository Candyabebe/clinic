package Pojos;

import java.util.Date;

public class Transaction {
    Double amount;
    String ServicePaidFor;
    Date date;
    Patient p;

    public Transaction() {
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getServicePaidFor() {
        return ServicePaidFor;
    }

    public void setServicePaidFor(String servicePaidFor) {
        ServicePaidFor = servicePaidFor;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Patient getP() {
        return p;
    }

    public void setP(Patient p) {
        this.p = p;
    }
}
