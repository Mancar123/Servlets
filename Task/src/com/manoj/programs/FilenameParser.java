package com.manoj.programs;

public class FilenameParser {
    public static void main(String[] args) {
        String filename = "java";
        try {
            String extension = filename.substring(filename.lastIndexOf(".") + 1);
            System.out.println("Extension: " + extension);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: error filename.");
        }
    }
}
