/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 *
 * @author S.Lucas
 */
public class Utils {

    public static String calcularMD5(String senha) {
        String hashMD5 = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");

            md.update(senha.getBytes());

            byte[] digest = md.digest();

            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            hashMD5 = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algoritmo MD5 nao enncontrado");
        }
        return hashMD5;
    }

}
