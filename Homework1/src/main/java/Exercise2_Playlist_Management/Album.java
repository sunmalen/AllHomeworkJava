/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise2_Playlist_Management;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.sound.midi.Track;

/**
 *
 * @author malen
 */
public class Album {
    private int id ;
    private String name;
    private int year;
    private Artist artist;
    private final List<Tracks> tracks = new ArrayList<Tracks>();
    
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
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    
    public Artist getArtist(){
        return artist;
    }
    
    public void setArtist(Artist artist){
        this.artist = artist;
    }
    
    public List<Tracks>getTracks(){
        return tracks;
    }
    
    @Override
    public String toString(){
        String displayTracks = this.getTracks().stream().map(s -> "\t-" + s.toString() + "\n").collect(Collectors.joining());
              
        return "ID : " + this.getId()+
                ", NAME : " + this.getName() +
                ", YEAR : " + this.getYear()+
                ", AETIST : " + this.getArtist().toString() + "}"+
                ", TRACKS : \n " + displayTracks;
                 
    }
}
