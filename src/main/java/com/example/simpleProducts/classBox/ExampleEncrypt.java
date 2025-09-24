package com.example.simpleProducts.classBox;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.beans.Encoder;

public class ExampleEncrypt {

    private static final String ALGORITHM = "SHA-256";
    private static final String ENCODE = "UTF-8";



    public static void main(String[] args) {


        String str = "Contraseña";





        try {
           ;

            System.out.println( (str.getBytes()));
            System.out.println( Encrypt(str));



        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static String Encrypt(String input) {
        try {
            MessageDigest dgt = MessageDigest.getInstance("SHA-256");

            byte[] hashBytes = dgt.digest(input.getBytes("UTF-8"));

            // Convertir a hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

public static byte [] getDigest (byte [] mensaje ) throws NoSuchAlgorithmException, UnsupportedEncodingException {

    byte[] resumen;

    MessageDigest dgt = MessageDigest.getInstance(ALGORITHM);

    dgt.reset();
    dgt.update(mensaje);
    resumen = dgt.digest();
    byte[] hash = getDigest("ContraseñTodoJunto24".getBytes("UTF-8"));

    return hash;


}


















}
