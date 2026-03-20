package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Di el nombre de la carpeta nueva:");
        String nom = sc.next();

        try {
            Path path = Paths.get(nom);
            Files.createDirectories(path);
            System.out.println("Directorio creado en: " + path);

            // Before creating a file, ensure that the directory exists. If it does not
            // exist, create it using Files.createDirectory() or Files.createDirectories().
            if (!Files.exists(path)) {
                Files.createDirectories(path);
            }

            // Once the directory is confirmed to exist, you can create a new file using the
            // Files.createFile() method.
            Path filePath = path.resolve("hola.txt");
            if (!Files.exists(filePath)) {
                try {
                    Files.createFile(filePath);
                } catch (IOException e) {
                }
            }
        } catch (IOException e) {
        }

    }
}