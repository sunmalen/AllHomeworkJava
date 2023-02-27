/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2_Playlist_Management;

/**
 *
 * @author malen
 */
public class Tracks {
    private int id ;
    private String name;
    private String type;
    private float duration;
   
    public Tracks(int id, String name, String type, float duration){
        this.id = id ;
        this.name = name;
        this.type = type ;
        this.duration = duration;
    }
    
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
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }
    public float getDuration(){
        return duration;
    }
    public void setDuration(float duration){
        this.duration = duration;
    }
    
    @Override
    public String toString(){
        return "ID : " + this.getId()+
                ",Name : " + this.getName()+
                ",TYPE : " + this.getType()+
                ",Duration : " + this.getDuration();
    }
}
 