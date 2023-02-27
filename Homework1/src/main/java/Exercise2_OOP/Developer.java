/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2_OOP;

/**
 *
 * @author malen
 */
public class Developer extends Employee{
    public static String comments = "Good";
    
  public Developer(String lastName, String firstName, int BirthOfDate, double salary,int years,String holiday,String comments){
    super(lastName,firstName,BirthOfDate,salary,years,holiday);
 
  }

public  void printEmployeeDetails() {
    System.out.println( "5. Add Constructor so we can create a Developer from an Employee Object(--Already--");
    System.out.println("Employee lastName     :  " + lastName);
    System.out.println("Employee firstName   :  " +  firstName);
    System.out.println("Employee BirthOfDate   :  " + BirthOfDate);
    System.out.println("Employee Salary : salary " +  salary);
    System.out.println("Employee Sears : years " +  years);
    System.out.println("Employee Holiday : holiday " +  holiday);
    System.out.println("Employee Coment: Comment " +  comments);
  }
    
   public static void main(String args[]) {
        // TODO code application logic here
         Developer  emp = new Developer("Malen", "Sun",2022,223.40,2,"SUNDAY",comments);
         emp.printEmployeeDetails();
    
    }
   
}