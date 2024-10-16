

import java.io.Serializable;

public class Song implements Serializable {
        private String title;
        private String artist;
        private String genre;
        private int year;
        private int timesPlayed;
        //	利用注解或者自己创建构造器和get方法
    Song(String title, String artist, String genre, int year, int timesPlayed) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.timesPlayed = timesPlayed;

    }
    public String getGenre() {
        return genre;
    }
    public String toString() {
        return(title + " " + artist + " " + genre + " " + year + " " + timesPlayed);
    }
    }
