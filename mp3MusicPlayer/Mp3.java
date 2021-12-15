package mp3MusicPlayer;

import java.io.OptionalDataException;

public class Mp3 {

    private long id;
    private String artist;
    private long duration;
    private String title;
    private boolean power;
    private int numberOfSongs;






    public boolean isPowerOn() { return power; }

    public boolean turnOn() { return power = true;}

    public void setSong(long songId, String songTitle, String songArtist) {

        id = songId;
        title = songTitle;
        artist = songArtist;
    }

    public long getId(){return id;}
    public String getTitle(){return title;}
    public String getArtist() {return artist;}


}
