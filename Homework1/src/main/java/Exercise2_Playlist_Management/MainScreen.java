/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Exercise2_Playlist_Management;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
/**
 *
 * @author malen
 */
public class MainScreen {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        List<Artist> listArtists = new LinkedList<Artist>();
        // sun malen
        Artist malen = new Artist();
        malen.setId(1);
        malen.setName("Sun Malen");
        malen.setGender('F');
        malen.setAge(20);
       listArtists.add(malen);
       //2
       Artist vanda = new Artist();
       vanda.setId(2);
       vanda.setName("Chan Vanda");
       vanda.setGender('M');
       vanda.setAge(25);
       listArtists.add(vanda);
       //3
       Artist david = new Artist();
       david.setId(3);
       david.setName("Chea David");
       david.setGender('M');
       david.setAge(28);
       listArtists.add(david);
       
       
       // for looping all list Artists
       listArtists.forEach(System.out :: println);
       
       // Album 1
       Album malenSong = new Album();
       malenSong.setId(1);
       malenSong.setName("Khmer Song 2022");
       malenSong.setYear(2022);
       malenSong.setArtist(malen);
       malenSong.getTracks().add(new Tracks(1,"Nobody love me","Chicha",2.2f));
       malenSong.getTracks().add(new Tracks(2,"I want to go home","LALA",3.3f));
       malenSong.getTracks().add(new Tracks(3,"Beutiful In Wife","Sweet",7.3f));
       
       System.out.println(malenSong.toString());
       
        // Album 2
       Album vandaSong = new Album();
       vandaSong.setId(1);
       vandaSong.setName("Khmer Song 2023");
       vandaSong.setYear(2022);
       vandaSong.setArtist(vanda);
       vandaSong.getTracks().add(new Tracks(1,"The time right now","Disco",2.2f));
       vandaSong.getTracks().add(new Tracks(2,"Be long love you","LALA",3.3f));
       vandaSong.getTracks().add(new Tracks(3,"Dream","Sweet",8.3f));
       
       System.out.println(vandaSong);
       
      
          // Album 3
       Album davidSong = new Album();
       davidSong.setId(1);
       davidSong.setName("Khmer Song 2024");
       davidSong.setYear(2022);
       davidSong.setArtist(david);
       davidSong.getTracks().add(new Tracks(1,"Yon and Me","Love Song",2.2f));
       davidSong.getTracks().add(new Tracks(2,"My love ","LALA",4.3f));
       davidSong.getTracks().add(new Tracks(3,"I love Mom ","Sweet",4.3f));
       
       System.out.println(davidSong);
       
       
      System.out.println(" === WHO HAS LONGER TRACKS ===");
      
      List<Album> allArtistAlbums = new ArrayList<Album>();
      allArtistAlbums.add(malenSong);
      allArtistAlbums.add(vandaSong);
      allArtistAlbums.add(davidSong);
     
      Optional<Album> longerTrack = allArtistAlbums.stream()
				.reduce((album1, album2) -> album1.getTracks().size() > album2.getTracks().size() ? album1 : album2);		
       
if (longerTrack.isPresent()) {
			System.out.println(longerTrack.get().toString());
		} else {
			System.out.println("Oop!");
		}
    }
}
