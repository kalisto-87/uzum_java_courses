package org.uzum.javacore_files;

import java.io.File;
import java.util.Scanner;

public class Homework2Template {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String inputDirectory = in.nextLine();

        System.out.println(String.format("Directory %s:", inputDirectory));

        searchFilesInFolder(inputDirectory);
    }

    private static void searchFilesInFolder(String path) {

        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        if (listOfFiles != null) {
            for (File file : listOfFiles) {
                if (file.isDirectory()) {
                    searchFilesInFolder(file.getAbsolutePath());
                }
                if (file.isFile()) {
                    System.out.println("- " + file.getName());
                }
            }
        }
    }

}
