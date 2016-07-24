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
public class FullTime extends Employee{
    
    private double salary = 0;
    private double overtime = 0;
    
    public FullTime(int id, String name, String vehicle, double Salary,
            double overtime){
        super(id,name,vehicle);
        this.salary = salary;
        this.overtime = overtime;
    }

    @Override
    public double calculatePay() {
        
        System.out.println("Full time employee ");
        
        return (salary + overtime);
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the overtime
     */
    public double getOvertime() {
        return overtime;
    }

    /**
     * @param overtime the overtime to set
     */
    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
    
}
