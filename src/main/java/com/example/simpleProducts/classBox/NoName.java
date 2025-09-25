package com.example.simpleProducts.classBox;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;


//A lo mejor esta clase es innecesaria.
public class NoName {

    private  String path;

    public NoName (String pathEx){

        this.path = pathEx;

    }

    public byte[] convertImageToBinary() throws IOException {
        File imageFile = new File(path);
        byte[] imageBytes = new byte[(int) imageFile.length()];

        try (FileInputStream fis = new FileInputStream(imageFile)) {
            fis.read(imageBytes);
        }

        return imageBytes;
    }

    public static void main(String[] args) {
        try {
          NoName nm = new NoName("C:\\Users\\guill\\IdeaProjects\\simpleProducts\\src\\main\\resources\\sofa.jpg");

          byte[] example = nm.convertImageToBinary();
            System.out.println("Imagen convertida a binario. Tamaño: " + example.length + " bytes");

            String binary = new BigInteger(1, example).toString(2);
            System.out.println(binary);






        } catch (IOException e) {
            System.err.println("Error al leer la imagen: " + e.getMessage());
        }
    }





}
