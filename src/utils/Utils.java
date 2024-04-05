/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

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

    public static Date converterStringToDate(String texto) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = null;

        try {
            data = formato.parse(texto);
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao converter a data");
        }
        return data;
    }

}
