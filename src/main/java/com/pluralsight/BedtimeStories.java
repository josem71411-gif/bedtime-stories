package com.pluralsight;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
public class BedtimeStories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     //Prompting the user
        System.out.print("Enter the story file name: ");
        String fileName = scanner.nextLine();

    // Read and print file
    try {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line;
        int lineNumber = 1;

        while ((line = reader.readLine())!= null) {
            System.out.println(lineNumber + ": " + line);
            lineNumber++;
        }
        reader.close();
    } catch (IOException e) {
        System.out.println("Error: Could not read the file.");
    }
    scanner.close();
    }

}
