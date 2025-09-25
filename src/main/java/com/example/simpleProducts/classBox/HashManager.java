package com.example.simpleProducts.classBox;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashManager {

    private static final String ALGORITHM = "SHA-256";
    private static final String ENCODE = "UTF-8";


public static String encrypt(String psswrd) throws NoSuchAlgorithmException, UnsupportedEncodingException {

    byte[] msg = psswrd.getBytes(ENCODE);

    MessageDigest dgt = MessageDigest.getInstance(ALGORITHM);
    dgt.reset();
    dgt.update(msg);

    return String.format("%064x", new BigInteger(1, dgt.digest()));

}

public static Boolean validatePassword(String a, String b){

        if (a.equals(b)){
            return true;
        }
        return false;

}


/*
    public static String encryptSHA256(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes());

            // Convertir el arreglo de bytes a una cadena hexadecimal
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }

            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error al encriptar la contraseña", e);
        }
    }
*/


}
