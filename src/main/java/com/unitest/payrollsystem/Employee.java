/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitest.payrollsystem;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.*;

/**
 *
 * @author Alex
 */
public abstract class Employee {
    private static Map<String, String>employeeList = new HashMap<>();
    private String empId;
    private String name;
    private String vehicle;
    
    public Employee(){
        
    }
    
    public String genEmpId(){
        SecureRandom rand = new SecureRandom();
        
        return new BigInteger(50, rand).toString(32);
    }
    

    /**
     * @return the empId
     */
    public String getEmpId() {
        return empId;
    }

    /**
     * @param empId the empId to set
     */
    public void setEmpId(String empId) {
        this.empId = empId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the vehicle
     */
    public String getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
    
    
    
    
}
