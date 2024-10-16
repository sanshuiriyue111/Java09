import java.io.*;
import java.util.*;


public class demo6 {
    public static void main(String[] args) {

        try {
            Writer w = new FileWriter("/Users/duqiu/Desktop/java/javapro/java1/src/com/java/Stream/demo9");
            w.write("package com.java.Stream;");
            w.write("\r\n");
            w.write("import java.io.Serializable;");
            w.write("\r\n");
            w.write("public class Song implements Serializable {");
            w.write("\r\n");
            w.write(" private String title;");
            w.write("\r\n");
            w.write(" private String artist;");
            w.write("\r\n");
            w.write(" private String album;");
            w.write("\r\n");
            w.write(" private String genre;");
            w.write("\r\n");
            w.write(" private int length;");
            w.write("\r\n");
            w.write("Song(String title, String artist, String genre, int year, int timesPlayed) {");
            w.write("\r\n");
            w.write(" this.title = title;");
            w.write("\r\n");
            w.write(" this.artist = artist;");
            w.write("\r\n");
            w.write(" this.album = album;");
            w.write("\r\n");
            w.write(" this.genre = genre;");
            w.write("\r\n");
            w.write(" this.length = year;");
            w.write("\r\n");
            w.write("}");
            w.write(" public String getGenre() {");
            w.write("\r\n");
            w.write(" return this.genre;");
            w.write("}");
            w.write("\r\n");
            w.write(" public int getLength() {");
            w.write("\r\n");
            w.write(" return this.length;");
            w.write("}");
            w.write("\r\n");
            w.write("public String toString() {");
            w.write("\r\n");
            w.write(" return(title + \" \" + artist + \" \" + genre + \" \" + year + \" \" + timesPlayed);");
            w.write("}");
            w.write("\r\n");
            w.write("}");
            w.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            Reader w = new FileReader("/Users/duqiu/Desktop/java/javapro/java1/src/com/java/Stream/demo9");
            int b;
            while ((b = w.read()) != -1) {
                System.out.print((char) b);
            }
        }catch(Exception e) {
            throw new RuntimeException(e);
        }


    }
}
