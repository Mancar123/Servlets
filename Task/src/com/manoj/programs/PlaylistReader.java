package com.manoj.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PlaylistReader {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("mast.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("Song: " + line);
            }
        } catch (IOException e) {
            System.out.println("Error reading playlist: " + e.getMessage());
        }
    }

}
