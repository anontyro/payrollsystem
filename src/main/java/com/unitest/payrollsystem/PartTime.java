/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitest.payrollsystem;

/**
 *
 * @author Alex
 */
public class PartTime extends Employee{
    
    private double rate = 0;
    private double hoursWorked = 0;
    
    public PartTime(int id, String name, String vehicle, double rate, double hoursWorked){
        super(id,name,vehicle);
        this.rate = rate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculatePay() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the rate
     */
    public double getRate() {
        return rate;
    }

    /**
     * @param rate the rate to set
     */
    public void setRate(double rate) {
        this.rate = rate;
    }

    /**
     * @return the hoursWorked
     */
    public double getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
}
