/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Exercise2_OOP;

/**
 *
 * @author malen
 */
public class Persons {
    private String lstname;
    private String firstname;
    private int birthdate;

    public String getLstname(){
        return lstname;
    }
    public void setLstname(String lstname){
        this.lstname = lstname;
    }
    public String getFirstname(){
        return firstname;
    }
    
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public int getBirthdate(){
        return birthdate;
    }
    public void setBirthdate(int birthdate){
        this.birthdate = birthdate;
    }
    
    public String toString(){
        return "LAST NAME : " + this.lstname +
                ", FIRST NAME : " + this.firstname + 
                ",BIRTH DATE : " + this.birthdate ;
    }
}
