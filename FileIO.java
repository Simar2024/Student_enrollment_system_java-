/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mystudentdesign;

/**
 *
 * @author Simar
 */
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileIO {
    
    
    public static List<String> readLines(String filename) throws IOException {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines;
    }

    public static void writeLines(String filename, List<String> lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
    
    public static void main (String [] args) throws IOException
    {
        FileWriter File = new FileWriter ("studentinfo.txt");
        FileWriter File2 = new FileWriter ("activities.txt");
    }
}
