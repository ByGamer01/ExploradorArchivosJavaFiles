package com.example;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            String usuarioTxt = sc.next();
            File fl = new File(usuarioTxt);
            File[] files = fl.listFiles(); // obtenemos todos los nombres de los archivos que haya en el directorio
            // en el directorio dado por el usuario
            for (int i = 0; i < files.length; i++) {
                String txtFile = files[i].getName();
                System.out.println(txtFile);
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}