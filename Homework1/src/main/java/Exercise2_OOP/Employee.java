/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2_OOP;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author malen
 */
public class Employee implements Lebelisable{
    String lastName;
    String firstName;
    int BirthOfDate;
    double salary;
    int years;
    String holiday;
   
    
   public Employee(String lastName,String firstName,int BirthOfDate,double salary,int years,String holiday) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.BirthOfDate = BirthOfDate;
    this.salary = salary;
    this.years = years;
    this.holiday = holiday;
    
   
  }
    
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
   public String getFirstName(){
       return firstName;
   }
   public void setFirstName(String firstName){
       this.firstName = firstName;
   }
   
   public int getBirthOfDate(){
       return BirthOfDate ;
   }
   
   public void setBirthOfDate(int birthOfBirth){
       this.BirthOfDate = birthOfBirth;
   }
   public double getSalary(){
       return salary;
   }
   public void setSalary(double salary){
       this.salary = salary;
   }
   
   public int getYear(){
       return years;
   }
   
   public void setYear(int years){
       this.years = years;
   }
   
   public String getHoliday(){
       return holiday;
   }
   public void setHoliday(String holiday){
       this.holiday = holiday;
   }
   
    @Override
     public void getLabel() {
     
        System.out.println(
                "1.Create class person with properties : birthdate ,lsname,firstname(--Already--)"
              +"\n"+ "2.Create class Employee with following properties : salary,holiay,years spent in the company and lastname,birthday,firstname(--Already-) " 
               +"\n" + "3. Create Interface Labelisable with the employee class to display all the data of an employee(--Alreay--)"
               +"\n" + "4. Create class Developer extends employee with preoperties: comments (--Already--) "
              +"\n"  + "5. Add Constructor so we can create a Developer from an Employee Object(--Already--"
               +"\n" + "6.Implements the interface Labelisable to display: NAME:UPPERCASE_NAME + number of projects (--Not yet--)"
              +"\n"  + "7.Use StringBuffer to manipulate string , the name should be in UPPERCASE (--Not Yet--) "
               +"\n" + "8.Create an Employee , a develper and a teamleader object.Put them in an array of Employee (--Already--)"
               +"\n" + "9.Loop on the array and display the information using the getLabel Method (--Alreay--)"
               +"\n" + "10.What happened? Explain in bugzila (Not Yet)"
               +"\n" + "Display the information by accessing directly to the object Example : Developer dev = new Developer() (dev.getLabel)(Already)"
               +"\n" 
        );   
        System.out.println("Value Data Of The Interface "+"\n"+"NAME : "+ Lebelisable.name +"\n"+"COMMENT : "+ Lebelisable.comment+"\n"+"SALARY : "+"$"+ Lebelisable.salary);
        System.out.println("Employee lastName     :  " + lastName);
        System.out.println("Employee firstName   :  " +  firstName);
        System.out.println("Employee BirthOfDate   :  " + BirthOfDate);
        System.out.println("Employee Salary : salary " +  salary);
        System.out.println("Employee Sears : years " +  years);
        System.out.println("Employee Holiday : holiday " +  holiday);
        
      
 
        Developer[] developer = new Developer[4];
         developer[0] = new Developer("malen0","sa0",2,1.0,2,"hh",Developer.comments);
         developer[1] = new Developer("malen1","sa1",2,1.0,2,"hh",Developer.comments);
         developer[2] = new Developer("malen2","sa2",2,1.0,2,"hh",Developer.comments);
         developer[3] = new Developer("malen3","sa3",2,1.0,2,"hh",Developer.comments);
         for(int j = 0 ; j < developer.length;j++){
               System.out.println(developer[j]);
          }
         

    }

    
    @Override
   public String toString(){
      return "LastName : "  + this.lastName +
              "FirstName : " + this.firstName +
              "BirthOfDate : " + this.BirthOfDate +
              "salary : " + this.salary +
              "years : "    +  this.years + 
              "Holiday : " + this.holiday;
              }
   
     public static void main(String args[])throws IOException {
         //create arry 

         
        int ar[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int ii, x;
  
        // iterating over an array
        for (ii = 0; ii < ar.length; ii++) {
  
            // accessing each element of array
            x = ar[ii];
            System.out.print(x + " ");
        }
 
         TeamLeader[] teamleader = new TeamLeader[3];
         teamleader[0] = new TeamLeader(2);
         teamleader[1] = new TeamLeader(3);
         teamleader[2] = new TeamLeader(4);
         for(int i = 0 ; i < teamleader.length;i++){
            System.out.println(teamleader[i]);
         }
      

            StringBuffer sb = new StringBuffer("Hello".toUpperCase());
          //  sb.append(Arrays.toString(developer).toLowerCase());
            //now original string is changed.
            System.out.println(sb);//prints Hello Java. 
         
             Employee emp = new Employee ("Malen", "Sun",2022,223.40,2,"SUNDAY");
   emp.getLabel();
   }
}
