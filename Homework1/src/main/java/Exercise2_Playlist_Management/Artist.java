/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2_Playlist_Management;

/**
 *
 * @author malen
 */
public class Artist {
    private int id;
    private String name;
    private char gender;
    private int age;
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender = gender;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    @Override
    public String toString(){
        return "ID: "+ this.getId()+
                ", Name : " + this.getName() +
                ", GENDER : " + this.getGender() +
                ", AGE : " + this.getAge();
    }

}
