package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date dueDate;
    private double amounnt;

    public Installment(){}

    public Installment(Date dueDate, double amounnt) {
        this.dueDate = dueDate;
        this.amounnt = amounnt;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmounnt() {
        return amounnt;
    }

    public void setAmounnt(double amounnt) {
        this.amounnt = amounnt;
    }

    @Override
    public String toString() {
        return sdf.format(dueDate) + " - " + String.format("%.2f", amounnt);
    }

    
}
