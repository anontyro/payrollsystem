/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unitest.payrollsystem;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class PayrollSystem {

    public static void main(String[] args) {
        ArrayList<Employee> arrEmp = new ArrayList<>();
        String varCount = "N";
        byte menuOption = 0;

        do {
            menuOption = showMenu();
            switch (menuOption) {
                case 1:
                    FullTime ft;
                    ft = readNewFullTime();
                    addEmployee(arrEmp, ft);
                    break;
                case 2:
                    PartTime pt;
                    pt = readNewPartTime();
                    addEmployee(arrEmp, pt);
                    break;
                case 3:
                    calcPayroll(arrEmp);
                    break;
                default:
                    break;
            }
        } while (menuOption != 4);

    }

    private static FullTime readNewFullTime() {
        int id = 0;
        String name = null;
        double sal = 0.0;
        double hourAndHalf = 0.0;
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter Id: ");
        id = kbd.nextInt();
        System.out.println("\n Enter Name: ");
        name = kbd.next();
        System.out.println("\n Enter Salary: ");
        sal = kbd.nextDouble();
        System.out.println("\n Enter Bonus: ");
        hourAndHalf = kbd.nextDouble();

        FullTime ft1 = new FullTime(id, name, sal, hourAndHalf, getVehicle());

        return ft1;
    }

    private static PartTime readNewPartTime() {
        int id = 0;
        String name = null;
        double rate = 0.0;
        double hoursWorked = 0.0;
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter Id: ");
        id = kbd.nextInt();
        System.out.println("\n Enter Name: ");
        name = kbd.next();
        System.out.println("\n Hourly Rate: ");
        rate = kbd.nextDouble();
        System.out.println("\n Enter Number of Hours Worked: ");
        hoursWorked = kbd.nextDouble();

        PartTime pt1 = new PartTime(id, name, rate, hoursWorked, v1);

        return pt1;
    }
    
    public static void addEmployee(ArrayList<Employee>pArrEmp, Employee pEmp){
        pArrEmp.add(pEmp);
    }
    
    public static byte showMenu(){
        
        byte menuOption = 0;
        Scanner kbd = new Scanner(System.in);
        
        System.out.println(""
                + "/*********************************************/"
                + "\n/* 1. Add FullTime                         */"
                + "\n/* 2. Add PartTime                         */"
                + "\n/* 3. Calculate Payroll                    */"
                + "\n/* 4. Exit                                 */"
                + "/*********************************************/"
        );
        System.out.println("Input: ");
        menuOption = kbd.nextByte();
        
        return menuOption;   
    }
    
    public static void calcPayroll(ArrayList<Employee>pArrEmp){
        double totalCompanyPay = 0.0;
        double individualPay;
        
        for(int i = 0; i < pArrEmp.size(); i++){
            System.out.println("\n*********************************************\n");
            individualPay =(pArrEmp.get(i)).calculatePay();
            Vehicle v =(pArrEmp.get(i)).getVehicle();
            String hasVehicle;
            
            if(v==null){
                hasVehicle = "No";
            }
            else{
                hasVehicle = "Yes";
            }
            
            System.out.println("Employee Name: " +(pArrEmp.get(i)).getName());
            System.out.println("Has Vehicle: " + hasVehicle);
            
            if(v != null){
                System.out.println("Plate Number: " + v.getPlateNumber());
                System.out.println("Colour: " + v.getColour());
            }
            
            System.out.println("Take Home Pay: " +individualPay);
            
            totalCompanyPay += individualPay;   
        }
        System.out.println("Total payroll of the compnay: " +totalCompanyPay);
    }
    
    public static Vehicle getVehicle(){
        Scanner kbd = new Scanner(System.in);
        String hasVehicle = "N";
        
        System.out.println("Does this employee have a vehicle? Y/N: \n Input:");
        hasVehicle = kbd.next();
        
        if(hasVehicle.equalsIgnoreCase("Y")){
            System.out.println("Enter plate number: ");
            String auxPlate = kbd.next();
            System.out.println("Enter vehicle colour: ");
            String auxColour = kbd.next();
        }
        else{
            return(null);
        }
    }

}
